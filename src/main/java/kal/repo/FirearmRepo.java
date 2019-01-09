package kal.repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

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
		// TODO Create Criteria search
		return null;
	}
}
