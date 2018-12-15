package kal.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name = "Cartridge")
@Table(name = "cartridge")
public class CartridgeH {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String ammoCaliber;
	private String ammoType;
	private String ammoManufacturer;
	private String ammoName;
	private double bulletMassGrams;
	private double advMuzzLeVelocityMps;
	private double advMuzzleEnergyJ;
	private double ballisticCoefficient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmmocaliber() {
		return ammoCaliber;
	}

	public void setAmmocaliber(String ammocaliber) {
		this.ammoCaliber = ammocaliber;
	}

	public String getAmmotype() {
		return ammoType;
	}

	public void setAmmotype(String ammotype) {
		this.ammoType = ammotype;
	}

	public String getAmmomanufacturer() {
		return ammoManufacturer;
	}

	public void setAmmomanufacturer(String ammomanufacturer) {
		this.ammoManufacturer = ammomanufacturer;
	}

	public String getAmmoname() {
		return ammoName;
	}

	public void setAmmoname(String ammoname) {
		this.ammoName = ammoname;
	}

	public double getBulletmassgrams() {
		return bulletMassGrams;
	}

	public void setBulletmassgrams(double bulletmassgrams) {
		this.bulletMassGrams = bulletmassgrams;
	}

	public double getAdvmuzzlevelocitymps() {
		return advMuzzLeVelocityMps;
	}

	public void setAdvmuzzlevelocitymps(double advmuzzlevelocitymps) {
		this.advMuzzLeVelocityMps = advmuzzlevelocitymps;
	}

	public double getAdvmuzzleenergyj() {
		return advMuzzleEnergyJ;
	}

	public void setAdvmuzzleenergyj(double advmuzzleenergyj) {
		this.advMuzzleEnergyJ = advmuzzleenergyj;
	}

	public double getBallisticcoefficient() {
		return ballisticCoefficient;
	}

	public void setBallisticcoefficient(double ballisticcoefficient) {
		this.ballisticCoefficient = ballisticcoefficient;
	}
}
