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
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import kal.BO.SearchSpec;
import kal.hibernate.EManager;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;

@Named("firearmRepository")
@Dependent
public class FirearmRepo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3488606652672604177L;
	@Inject
	@EManager
	private EntityManager em;
	

	public void addFirearms(List<FirearmH> firearm) {
		for (FirearmH f : firearm) {
			em.persist(f);
		}
	}

	public void removeFirearms(List<FirearmH> firearm) {
		for (FirearmH f : firearm) {
			em.remove(f);
		}
	}

	public void updateFirearms(List<FirearmH> firearm) {
		// TODO If ever needed, implement it
	}

	public List<FirearmH> findFirearms(List<SearchSpec> searchSpec) {
		CriteriaBuilder critbuilder = em.getCriteriaBuilder();
		CriteriaQuery<FirearmH> crit = critbuilder.createQuery(FirearmH.class);
		Root<FirearmH> firearms = crit.from(FirearmH.class);
		Predicate[] predicates = new Predicate[searchSpec.size()];
		List<Predicate> predicatesList = new ArrayList<Predicate>();
		// TODO Check and build OR predicates and AND predicates, then both of
		// them
		List<String> paramList = Arrays.asList("gun-type", "caliber", "gun-magazine", "gun-weight", "gun-length",
				"gun-barrel-length");
		int i = 0;
		for (String param : paramList) {
			// predicates[i] = critbuilder.equal(searchSpec.get("username"),
			// searchSpec.get(i));
			switcher(param,predicatesList);

		}
		crit.select(firearms).where(predicatesList.toArray(new Predicate[predicatesList.size()]));
		List<FirearmH> resultPM = em.createQuery(crit).getResultList();

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

		}
	}

}
