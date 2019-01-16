package kal.repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		Root<FirearmH> firearms = query.from(FirearmH.class);
		Join<FirearmH, CartridgeH> cartridges = firearms.join("caliber", JoinType.LEFT);
		Predicate[] predicates = new Predicate[searchSpecCartridge.size() + searchSpecFirearms.size()];
		List<Predicate> predicatesList = new ArrayList<Predicate>();
		// TODO Check and build OR predicates and AND predicates, then combine both of
		// them
		//TODO Check for possible mapping solutions
		List<String> paramList = Arrays.asList("gun-type", "caliber", "gun-magazine", "gun-weight", "gun-length",
				"gun-barrel-length", "ammo-type", "caliber", "ammo-energy", "ammo-velocity", "ammo-mass",
				"ammo-round-type");
		int i = 0;
		for (String param : paramList) {
			// predicates[i] = critbuilder.equal(searchSpec.get("username"),
			// searchSpec.get(i));
			switcher(param, predicatesList);

		}
		query.multiselect(firearms, cartridges);/*.where(predicatesList.toArray(new Predicate[predicatesList.size()]));*/
		//TODO Possibly stream into result list to be sure
		List<ResourceObject> resultPM = em.createQuery(query).getResultList();

		return resultPM;

	}

	private void switcher(String param, List<Predicate> predicates) {
		switch (param) {
		case "gun-type":
			break;
		case "caliber":
			break;
		case "gun-magazine":
			break;
		case "gun-weight":
			break;
		case "gun-length":
			break;
		case "gun-barrel-length":
			break;
		case "ammo-type":
			break;
		case "ammo-energy":
			break;
		case "ammo-velocity":
			break;
		case "ammo-mass":
			break;
		case "ammo-round-type":
			break;

		}
	}
}
