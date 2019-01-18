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
@Entity(name = "Firearm")
@Table(name = "firearm")
public class FirearmH {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@Column(name="gunType")
	private String gunType;
	@Column(name="gunManufacturer")
	private String gunManufacturer;
	@Column(name="gunModel")
	private String gunModel;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "caliber_id")
	private CaliberH caliberVal;
	@Column(name="stdMagazineCapacity")
	private int stdMagazineCapacity;
	@Column(name="muzzleLengthMm")
	private double muzzleLengthMm;
	@Column(name="gunWeightEmptyGrams")
	private double gunWeightEmptyGrams;
	@Column(name="boreAxisOffsetMm")
	private double boreAxisOffsetMm;
	@Column(name="dimensionX")
	private double dimensionX;
	@Column(name="dimensionY")
	private double dimensionY;
	@Column(name="dimensionZ")
	private double dimensionZ;
	@Column(name="ccwBox")
	private double ccwBox;
	private String tags;
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuntype() {
		return gunType;
	}

	public void setGuntype(String guntype) {
		this.gunType = guntype;
	}

	public CaliberH getCaliber() {
		return caliberVal;
	}

	public void setCaliber(CaliberH caliber) {
		this.caliberVal = caliber;
	}

	public String getGunmanufacturer() {
		return gunManufacturer;
	}

	public void setGunmanufacturer(String gunmanufacturer) {
		this.gunManufacturer = gunmanufacturer;
	}

	public String getGunmodel() {
		return gunModel;
	}

	public void setGunmodel(String gunmodel) {
		this.gunModel = gunmodel;
	}

	public int getStdmagazinecapacity() {
		return stdMagazineCapacity;
	}

	public void setStdmagazinecapacity(int stdmagazinecapacity) {
		this.stdMagazineCapacity = stdmagazinecapacity;
	}

	public double getMuzzlelengthmm() {
		return muzzleLengthMm;
	}

	public void setMuzzlelengthmm(double muzzleLengthMm) {
		this.muzzleLengthMm = muzzleLengthMm;
	}

	public double getGunweightemptygrams() {
		return gunWeightEmptyGrams;
	}

	public void setGunweightemptygrams(double gunweightemptygrams) {
		this.gunWeightEmptyGrams = gunweightemptygrams;
	}

	public double getBoreaxisoffsetmm() {
		return boreAxisOffsetMm;
	}

	public void setBoreaxisoffsetmm(double boreaxisoffsetmm) {
		this.boreAxisOffsetMm = boreaxisoffsetmm;
	}

	public double getDimensionx() {
		return dimensionX;
	}

	public void setDimensionx(double dimensionx) {
		this.dimensionX = dimensionx;
	}

	public double getDimensiony() {
		return dimensionY;
	}

	public void setDimensiony(double dimensiony) {
		this.dimensionY = dimensiony;
	}

	public double getDimensionz() {
		return dimensionZ;
	}

	public void setDimensionz(double dimensionz) {
		this.dimensionZ = dimensionz;
	}

	public double getCcwbox() {
		return ccwBox;
	}

	public void setCcwbox(double ccwbox) {
		this.ccwBox = ccwbox;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
