package kal.repo;

import java.io.Serializable;
import java.util.ArrayList;
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
public class FirearmRepo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3488606652672604177L;
	@Inject
	@EManager
	private EntityManager em;
	private List<FirearmH> data = new ArrayList<FirearmH>();

	public void addFirearms(List<FirearmH> firearm) {
		data.addAll(firearm);

	}

	public void removeFirearms(List<FirearmH> firearm) {
		data.removeAll(firearm);

	}

	public void updateFirearms(List<FirearmH> firearm) {
		for (FirearmH fH : firearm) {
			data.set(fH.getId(), fH);

		}
	}
	public List<FirearmH> findFirearms(List<SearchSpec> searchSpec) {
		CriteriaBuilder critbuilder = em.getCriteriaBuilder();
		CriteriaQuery<FirearmH> crit = critbuilder.createQuery(FirearmH.class);
		Root<FirearmH> firearms = crit.from(FirearmH.class);
		Predicate[] predicates = new Predicate[searchSpec.size()];
		for (int i = 0; i <= searchSpec.size(); i++) {
			//predicates[i] = critbuilder.equal(searchSpec.get("username"), searchSpec.get(i));
			
		}
		crit.select(firearms).where(predicates);
		List<FirearmH> resultPM = em.createQuery(crit).getResultList();
		
		return resultPM;
		
		
	}
	
}
