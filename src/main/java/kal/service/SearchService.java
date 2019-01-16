package kal.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import kal.BO.ResourceObject;
import kal.BO.SearchSpec;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;
import kal.repo.CartridgeRepo;
import kal.repo.FirearmRepo;

@Named("searchService")
@SessionScoped
// @Dependent
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

	/** This method will be used */
	public List<ResourceObject> searchResources(List<SearchSpec> searchSpec) {
		// TODO Get data from both repos, then combine
		// into Resource
		List<SearchSpec> searchSpecCartridge = searchSpec.stream()
				.filter(ss -> ss.paramName.contains("ammo") || ss.paramName.contains("caliber"))
				.collect(Collectors.toList());
		List<SearchSpec> searchSpecFirearms = searchSpec.stream()
				.filter(ss -> ss.paramName.contains("gun") || ss.paramName.contains("caliber"))
				.collect(Collectors.toList());
		List<FirearmH> listFirearms = firearmData.findFirearms(searchSpecFirearms);
		List<CartridgeH> listCartriges = cartridgeData.findCartridges(searchSpecCartridge);

		return null;
	}
}
