package kal.repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import kal.hibernate.EManager;
import kal.persistence.CartridgeH;
@Named("cartridgeRepository")
@Dependent
public class CartridgeRepo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1283590920205500045L;
	@Inject
	@EManager
	private EntityManager em;
	

	public void addCartridge(List<CartridgeH> cartridge) {
		for(CartridgeH cH: cartridge){
			em.persist(cH);
		}

	}

	public void removeCartridge(List<CartridgeH> cartridge) {
		for(CartridgeH cH: cartridge){
			em.remove(cH);
		}
	}

	public void updateCartridge(List<CartridgeH> cartridge) {
		for (CartridgeH cH : cartridge) {
			em.refresh(cH);

		}
	}

	public CartridgeH findByAmmoName(String ammoName) {
		//Use Criteria
		return null;
	}
}
