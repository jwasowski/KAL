package kal.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name = "Cartridge")
@Table(name = "cartridge")
public class CartridgeH {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "caliber_id")
	private CaliberH caliberVal;
	@Column(name="ammoType")
	private String ammoType;
	@Column(name="ammoManufacturer")
	private String ammoManufacturer;
	@Column(name="ammoName")
	private String ammoName;
	@Column(name="bulletMassGrams")
	private double bulletMassGrams;
	@Column(name="advMuzzLeVelocityMps")
	private double advMuzzLeVelocityMps;
	@Column(name="advMuzzleEnergyJ")
	private double advMuzzleEnergyJ;
	@Column(name="ballisticCoefficient")
	private double ballisticCoefficient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CaliberH getCaliber() {
		return caliberVal;
	}

	public void setCaliber(CaliberH caliber) {
		this.caliberVal = caliber;
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
