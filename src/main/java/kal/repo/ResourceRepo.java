package kal.repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import kal.BO.ResourceObject;
import kal.BO.SearchSpec;
import kal.hibernate.EManager;
import kal.persistence.CaliberH;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;

@Named("resourceRepository")
@Dependent
public class ResourceRepo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 994421341203260620L;
	@Inject
	@EManager
	private EntityManager em;

	public List<ResourceObject> findResources(List<SearchSpec> searchSpecCartridge,
			List<SearchSpec> searchSpecFirearms) {
		CriteriaBuilder critbuilder = em.getCriteriaBuilder();
		CriteriaQuery<ResourceObject> query = critbuilder.createQuery(ResourceObject.class);
		Root<CaliberH> calibers = query.from(CaliberH.class);
		// Target of Join is field from CaliberH (lists with related objects)
		Join<CaliberH, FirearmH> firearms = calibers.join("firearms", JoinType.LEFT);
		Join<CaliberH, CartridgeH> cartridges = calibers.join("cartridges", JoinType.LEFT);
		List<Predicate> predicatesList = new ArrayList<Predicate>();
		// TODO Fill paramList with paramNames contained in searchSpecs to
		// improve performance
		List<String> paramList = Arrays.asList("gun-manufacturer", "gun-type", "caliber", "gun-magazine", "gun-weight",
				"gun-length", "gun-barrel-length", "ammo-type", "caliber", "ammo-manufacturer", "ammo-name",
				"ammo-energy", "ammo-velocity", "ammo-mass");
		for (String param : paramList) {
			switcher(param, predicatesList, critbuilder, searchSpecCartridge, searchSpecFirearms, calibers, firearms,
					cartridges);
		}
		query.multiselect(firearms.get("gunManufacturer"), firearms.get("gunType"), cartridges.get("ammoType"),
				firearms.get("stdMagazineCapacity"), calibers.get("caliber"), cartridges.get("ammoManufacturer"),
				cartridges.get("ammoName"), firearms.get("gunWeightEmptyGrams"), firearms.get("dimensionX"),
				firearms.get("muzzleLengthMm"), cartridges.get("advMuzzleEnergyJ"),
				cartridges.get("advMuzzLeVelocityMps"), cartridges.get("bulletMassGrams"))
				.where(predicatesList.toArray(new Predicate[predicatesList.size()]))
				.orderBy(critbuilder.desc(firearms.get("dimensionX")));
		List<ResourceObject> resultPM = em.createQuery(query).setMaxResults(100).getResultList();

		return resultPM;

	}
	//TODO Decide about gunType and ammoType check
	private void switcher(String param, List<Predicate> predicates, CriteriaBuilder critbuilder,
			List<SearchSpec> searchSpecCartridges, List<SearchSpec> searchSpecFirearms, Root<CaliberH> calibers,
			Join<CaliberH, FirearmH> firearms, Join<CaliberH, CartridgeH> cartridges) {
		Predicate[] localPredicates;
		switch (param) {
		case "gun-type":
			List<SearchSpec> gunType = searchSpecFirearms.stream().filter(ss -> ss.paramName.contains("gun-type"))
					.collect(Collectors.toList());
			// TODO Check if null check is needed
			if (!gunType.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[gunType.size()];
				for (SearchSpec ss : gunType) {
					localPredicates[i] = critbuilder.equal(firearms.get("gunType"), ss.string);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "caliber":
			List<SearchSpec> caliber = searchSpecFirearms.stream().filter(ss -> ss.paramName.contains("caliber"))
					.collect(Collectors.toList());
			if (!caliber.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[caliber.size()];
				for (SearchSpec ss : caliber) {
					localPredicates[i] = critbuilder.like(calibers.get("caliber"), ss.string);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "gun-magazine":
			List<SearchSpec> gunMagazine = searchSpecFirearms.stream()
					.filter(ss -> ss.paramName.contains("gun-magazine")).collect(Collectors.toList());
			if (!gunMagazine.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[gunMagazine.size()];
				for (SearchSpec ss : gunMagazine) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(firearms.get("stdMagazineCapacity"), ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "gun-weight":
			List<SearchSpec> gunWeight = searchSpecFirearms.stream().filter(ss -> ss.paramName.contains("gun-weight"))
					.collect(Collectors.toList());
			if (!gunWeight.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[gunWeight.size()];
				for (SearchSpec ss : gunWeight) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(firearms.get("gunWeightEmptyGrams"), ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "gun-length":
			List<SearchSpec> gunLength = searchSpecFirearms.stream().filter(ss -> ss.paramName.contains("gun-weight"))
					.collect(Collectors.toList());
			if (!gunLength.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[gunLength.size()];
				for (SearchSpec ss : gunLength) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(firearms.get("dimensionX"), ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "gun-barrel-length":
			List<SearchSpec> gunBarrelLength = searchSpecFirearms.stream()
					.filter(ss -> ss.paramName.contains("gun-barrel-length")).collect(Collectors.toList());
			if (!gunBarrelLength.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[gunBarrelLength.size()];
				for (SearchSpec ss : gunBarrelLength) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(firearms.get("muzzleLengthMm"), ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "ammo-type":
			List<SearchSpec> ammoType = searchSpecCartridges.stream().filter(ss -> ss.paramName.contains("ammo-type"))
					.collect(Collectors.toList());
			if (!ammoType.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[ammoType.size()];
				for (SearchSpec ss : ammoType) {
					localPredicates[i] = critbuilder.equal(cartridges.get("ammoType"), ss.string);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "ammo-energy":
			List<SearchSpec> ammoEnergy = searchSpecCartridges.stream()
					.filter(ss -> ss.paramName.contains("ammo-energy")).collect(Collectors.toList());
			if (!ammoEnergy.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[ammoEnergy.size()];
				for (SearchSpec ss : ammoEnergy) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(cartridges.get("advMuzzleEnergyJ"), ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "ammo-velocity":
			List<SearchSpec> ammoVelocity = searchSpecCartridges.stream()
					.filter(ss -> ss.paramName.contains("ammo-velocity")).collect(Collectors.toList());
			if (!ammoVelocity.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[ammoVelocity.size()];
				for (SearchSpec ss : ammoVelocity) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(cartridges.get("advMuzzLeVelocityMps"),
							ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "ammo-mass":
			List<SearchSpec> ammoMass = searchSpecCartridges.stream().filter(ss -> ss.paramName.contains("ammo-mass"))
					.collect(Collectors.toList());
			if (!ammoMass.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[ammoMass.size()];
				for (SearchSpec ss : ammoMass) {
					localPredicates[i] = critbuilder.lessThanOrEqualTo(cartridges.get("bulletMassGrams"), ss.value);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "gun-manufacturer":
			List<SearchSpec> gunManufacturer = searchSpecFirearms.stream()
					.filter(ss -> ss.paramName.contains("gun-manufacturer")).collect(Collectors.toList());
			if (!gunManufacturer.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[gunManufacturer.size()];
				for (SearchSpec ss : gunManufacturer) {
					localPredicates[i] = critbuilder.like(firearms.get("gunManufacturer"), ss.string);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "ammo-manufacturer":
			List<SearchSpec> ammoManufacturer = searchSpecCartridges.stream()
					.filter(ss -> ss.paramName.contains("ammo-manufacturer")).collect(Collectors.toList());
			if (!ammoManufacturer.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[ammoManufacturer.size()];
				for (SearchSpec ss : ammoManufacturer) {
					localPredicates[i] = critbuilder.like(cartridges.get("ammoManufacturer"), ss.string);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		case "ammo-name":
			List<SearchSpec> ammoName = searchSpecCartridges.stream().filter(ss -> ss.paramName.contains("ammo-name"))
					.collect(Collectors.toList());
			if (!ammoName.isEmpty()) {
				int i = 0;
				localPredicates = new Predicate[ammoName.size()];
				for (SearchSpec ss : ammoName) {
					localPredicates[i] = critbuilder.like(cartridges.get("ammoName"), ss.string);
					i++;
				}
				predicates.add(critbuilder.or(localPredicates));
			}
			break;
		}
	}
}
