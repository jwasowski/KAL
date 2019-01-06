package kal.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import kal.BO.SearchSpec;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;
import kal.repo.CartridgeRepo;
import kal.repo.FirearmRepo;

@Named("searchService")
@SessionScoped
public class SearchService implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6053342663933408916L;
	@Inject
	@Named("cartridgeRepository")
	private CartridgeRepo cartridgeData;
	@Inject
	@Named("firearmRepository")
	private FirearmRepo firearmData;

	public void addCartridges(List<CartridgeH> cartridges) {
		cartridgeData.addCartridges(cartridges);
	}

	public void removeCartridges(List<CartridgeH> cartridges) {
		cartridgeData.removeCartridges(cartridges);
	}

	public void updateCartridges(List<CartridgeH> cartridges) {
		cartridgeData.updateCartridges(cartridges);
	}

	public void addFirearms(List<FirearmH> firearms) {
		firearmData.addFirearms(firearms);
	}

	public void removeFirearms(List<FirearmH> firearms) {
		firearmData.removeFirearms(firearms);
	}

	public void updateFirearms(List<FirearmH> firearms) {
		firearmData.updateFirearms(firearms);
	}
	
	public List<FirearmH> findFirearms(List<SearchSpec> searchSpec){
		//TODO Implementation
		return null;
	}
	
	public List<CartridgeH> findCartridges(List<SearchSpec> searchSpec){
		//TODO Implementation
		return null;
	}
}
