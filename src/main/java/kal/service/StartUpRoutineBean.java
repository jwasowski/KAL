package kal.service;

import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import kal.hibernate.EManager;
import kal.persistence.CaliberH;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;

@Singleton
@Startup
@ApplicationScoped
public class StartUpRoutineBean {
	@Inject
	@EManager
	private EntityManager em;

	@PostConstruct
	private void startup() {
		CaliberH caliber = new CaliberH();
		caliber.setCaliber("9x19");
		
		FirearmH firearm = new FirearmH();
		firearm.setCaliber(caliber);
		firearm.setGuntype("Handgun");
		firearm.setGunmanufacturer("Glock");
		firearm.setGunmodel("19 Gen4");
		firearm.setStdmagazinecapacity(15);
		firearm.setMuzzlelengthmm(102);
		firearm.setGunweightemptygrams(600.0);
		firearm.setBoreaxisoffsetmm(20.0);
		firearm.setDimensionx(187.0);
		firearm.setDimensiony(32.0);
		firearm.setDimensionz(128.0);
		firearm.setCcwbox(1.87*0.32*1.28);
		CartridgeH cartridge = new CartridgeH();
		cartridge.setCaliber(caliber);
		cartridge.setAmmotype("FMJ");
		cartridge.setAmmomanufacturer("Federal");
		cartridge.setAmmoname("American Eagle");
		cartridge.setBulletmassgrams(115.0);
		cartridge.setAdvmuzzlevelocitymps(359.664);
		cartridge.setAdvmuzzleenergyj(356/0.7375621);
		cartridge.setBallisticcoefficient(0.19);
		caliber.setCartridges(new ArrayList<>(Arrays.asList(cartridge)));
		caliber.setFirearms(new ArrayList<>(Arrays.asList(firearm)));
		em.persist(caliber);
		em.persist(firearm);
		em.persist(cartridge);

	}

	@PreDestroy
	private void shutdown() {
		// TODO Some DB logic
	}

}
