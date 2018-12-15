package kal.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

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

	public void addCartridge(List<CartridgeH> cartridges) {
		cartridgeData.addCartridge(cartridges);
	}

	public void removeCartridge(List<CartridgeH> cartridges) {
		cartridgeData.removeCartridge(cartridges);
	}

	public void updateCartridge(List<CartridgeH> cartridges) {
		cartridgeData.updateCartridge(cartridges);
	}

	public void addFirearm(List<FirearmH> firearms) {
		firearmData.addFirearm(firearms);
	}

	public void removeFirearm(List<FirearmH> firearms) {
		firearmData.removeFirearm(firearms);
	}

	public void updateFirearm(List<FirearmH> firearms) {
		firearmData.updateFirearm(firearms);
	}
}
