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
		CaliberH ammo9x19 = new CaliberH();
		ammo9x19.setCaliber("9x19");
		ammo9x19.setCartridges(new ArrayList<CartridgeH>());
		ammo9x19.setFirearms(new ArrayList<FirearmH>());
		CaliberH ammo556x45Nato = new CaliberH();
		ammo556x45Nato.setCaliber("5.56x45 NATO");
		ammo556x45Nato.setCartridges(new ArrayList<CartridgeH>());
		ammo556x45Nato.setFirearms(new ArrayList<FirearmH>());
		CaliberH ammo762x39 = new CaliberH();
		ammo762x39.setCaliber("7.62x39");
		ammo762x39.setCartridges(new ArrayList<CartridgeH>());
		ammo762x39.setFirearms(new ArrayList<FirearmH>());
		FirearmH glock19gen4 = new FirearmH();
		glock19gen4.setCaliber(ammo9x19);
		glock19gen4.setGuntype("Handgun");
		glock19gen4.setGunmanufacturer("Glock");
		glock19gen4.setGunmodel("19 Gen4");
		glock19gen4.setStdmagazinecapacity(15);
		glock19gen4.setMuzzlelengthmm(102);
		glock19gen4.setGunweightemptygrams(600.0);
		glock19gen4.setBoreaxisoffsetmm(20.0);
		glock19gen4.setDimensionx(187.0);
		glock19gen4.setDimensiony(32.0);
		glock19gen4.setDimensionz(128.0);
		glock19gen4.setCcwbox(1.87*0.32*1.28);
		CartridgeH federalAE = new CartridgeH();
		federalAE.setCaliber(ammo9x19);
		federalAE.setAmmotype("FMJ");
		federalAE.setAmmomanufacturer("Federal");
		federalAE.setAmmoname("American Eagle");
		federalAE.setBulletmassgrams(115.0*0.06479891);
		federalAE.setAdvmuzzlevelocitymps(1180*0.3048);
		federalAE.setAdvmuzzleenergyj(356/0.7375621);
		federalAE.setBallisticcoefficient(0.19);
		CartridgeH federalAE2 = new CartridgeH();
		federalAE2.setCaliber(ammo9x19);
		federalAE2.setAmmotype("FMJ");
		federalAE2.setAmmomanufacturer("Federal");
		federalAE2.setAmmoname("American Eagle Heavy");
		federalAE2.setBulletmassgrams(147.0*0.06479891);
		federalAE2.setAdvmuzzlevelocitymps(1000*0.3048);
		federalAE2.setAdvmuzzleenergyj(326/0.7375621);
		federalAE2.setBallisticcoefficient(0.2);
		FirearmH glock43gen4 = new FirearmH();
		glock43gen4.setCaliber(ammo9x19);
		glock43gen4.setGuntype("Handgun");
		glock43gen4.setGunmanufacturer("Glock");
		glock43gen4.setGunmodel("43 Gen4");
		glock43gen4.setStdmagazinecapacity(6);
		glock43gen4.setMuzzlelengthmm(86.5);
		glock43gen4.setGunweightemptygrams(510);
		glock43gen4.setBoreaxisoffsetmm(20.0);
		glock43gen4.setDimensionx(159.0);
		glock43gen4.setDimensiony(27.0);
		glock43gen4.setDimensionz(108.0);
		glock43gen4.setCcwbox(1.59*0.27*1.08);
		FirearmH glock17gen4 = new FirearmH();
		glock17gen4.setCaliber(ammo9x19);
		glock17gen4.setGuntype("Handgun");
		glock17gen4.setGunmanufacturer("Glock");
		glock17gen4.setGunmodel("17 Gen4");
		glock17gen4.setStdmagazinecapacity(17);
		glock17gen4.setMuzzlelengthmm(114);
		glock17gen4.setGunweightemptygrams(625.0);
		glock17gen4.setBoreaxisoffsetmm(20.0);
		glock17gen4.setDimensionx(204.0);
		glock17gen4.setDimensiony(32.0);
		glock17gen4.setDimensionz(139.0);
		glock17gen4.setCcwbox(2.04*0.32*1.39);
		FirearmH radomSport = new FirearmH();
		radomSport.setCaliber(ammo556x45Nato);
		radomSport.setGuntype("Rifle");
		radomSport.setGunmanufacturer("FB Radom");
		radomSport.setGunmodel("RADOM-SPORT");
		radomSport.setStdmagazinecapacity(30);
		radomSport.setMuzzlelengthmm(457);
		radomSport.setGunweightemptygrams(3650.0);
		radomSport.setBoreaxisoffsetmm(1.0);
		radomSport.setDimensionx(910.0);
		radomSport.setDimensiony(32.0);
		radomSport.setDimensionz(139.0);
		radomSport.setCcwbox(9.1*0.32*1.39);
		FirearmH radomSport762 = new FirearmH();
		radomSport762.setCaliber(ammo762x39);
		radomSport762.setGuntype("Rifle");
		radomSport762.setGunmanufacturer("FB Radom");
		radomSport762.setGunmodel("RADOM-SPORT 762");
		radomSport762.setStdmagazinecapacity(30);
		radomSport762.setMuzzlelengthmm(419);
		radomSport762.setGunweightemptygrams(3600.0);
		radomSport762.setBoreaxisoffsetmm(1.0);
		radomSport762.setDimensionx(870.0);
		radomSport762.setDimensiony(32.0);
		radomSport762.setDimensionz(139.0);
		radomSport762.setCcwbox(8.7*0.32*1.39);
		CartridgeH nato556x45 = new CartridgeH();
		nato556x45.setCaliber(ammo556x45Nato);
		nato556x45.setAmmotype("FMJ");
		nato556x45.setAmmomanufacturer("Federal");
		nato556x45.setAmmoname("American pounding");
		nato556x45.setBulletmassgrams(200.0*0.06479891);
		nato556x45.setAdvmuzzlevelocitymps(1200*0.3048);
		nato556x45.setAdvmuzzleenergyj(400/0.7375621);
		nato556x45.setBallisticcoefficient(0.3);
		CartridgeH rus762x39 = new CartridgeH();
		rus762x39.setCaliber(ammo762x39);
		rus762x39.setAmmotype("FMJ");
		rus762x39.setAmmomanufacturer("Russian Surplus");
		rus762x39.setAmmoname("Russian Surplus 7.62x39");
		rus762x39.setBulletmassgrams(123.0*0.06479891);
		rus762x39.setAdvmuzzlevelocitymps(2421*0.3048);
		rus762x39.setAdvmuzzleenergyj(1607/0.7375621);
		rus762x39.setBallisticcoefficient(0.138);
		ammo9x19.getCartridges().add(federalAE);
		ammo9x19.getFirearms().add(glock19gen4);
		ammo9x19.getFirearms().add(glock17gen4);
		ammo9x19.getFirearms().add(glock43gen4);
		ammo9x19.getCartridges().add(federalAE2);
		ammo556x45Nato.getCartridges().add(nato556x45);
		ammo556x45Nato.getFirearms().add(radomSport);
		ammo762x39.getCartridges().add(rus762x39);
		ammo762x39.getFirearms().add(radomSport762);
		em.persist(ammo9x19);
		em.persist(ammo762x39);
		em.persist(glock19gen4);
		em.persist(federalAE);
		em.persist(federalAE2);
		em.persist(glock17gen4);
		em.persist(glock43gen4);
		em.persist(ammo556x45Nato);
		em.persist(nato556x45);
		em.persist(radomSport);
		em.persist(ammo762x39);
		em.persist(rus762x39);
		em.persist(radomSport762);
		
	}

	@PreDestroy
	private void shutdown() {
		// TODO Some DB logic
	}

}
