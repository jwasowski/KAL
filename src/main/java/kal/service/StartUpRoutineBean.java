package kal.service;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import kal.command.FrontCommandModel;
import kal.hibernate.EManager;
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
		// List<Config> result = em.createNamedQuery("config.check",
		// Config.class).getResultList();
		Map<String, FrontCommandModel.Type> commandMap = CommandList.getCommandMap();
		commandMap.put("GET/search", FrontCommandModel.Type.SEARCH);
		
		FirearmH firearm = new FirearmH();
		firearm.setGuncaliber("9x19");
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
		cartridge.setAmmocaliber("9x19");
		cartridge.setAmmotype("FMJ");
		cartridge.setAmmomanufacturer("Federal");
		cartridge.setAmmoname("American Eagle");
		cartridge.setBulletmassgrams(115.0);
		cartridge.setAdvmuzzlevelocitymps(359.664);
		cartridge.setAdvmuzzleenergyj(356/0.7375621);
		cartridge.setBallisticcoefficient(0.19);
		em.persist(firearm);
		em.persist(cartridge);

	}

	@PreDestroy
	private void shutdown() {
		// TODO Some DB logic
	}

}
