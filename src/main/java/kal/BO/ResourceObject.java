package kal.BO;

public class ResourceObject {
	/** Firearm */
	private String gunType;
	/** Cartridge */
	private String ammoType;
	/** Firearm */
	private int stdMagazineCapacity;
	/** Firearm, Cartridge */
	private String caliber;
	/** Firearm */
	private double gunWeightEmptyGrams;
	/** Param (dimX) */
	private double gunLength;
	/** Firearm */
	private double muzzleLengthMm;
	/** Cartridge */
	private double advMuzzleEnergyJ;
	/** Cartridge */
	private double advMuzzLeVelocityMps;
	/** Cartridge */
	private double bulletMassGrams;
	/** Combined param */
	private double effectiveRange;
	/** Combined param */
	private double gunRecoilX;
	/** Combined param */
	private double gunRecoilY;

	public ResourceObject(String gunType, String ammoType, int stdMagazineCapacity, String caliber,
			double gunWeightEmptyGrams, double gunLength, double muzzleLengthMm, double advMuzzleEnergyJ,
			double advMuzzLeVelocityMps, double bulletMassGrams, double effectiveRange, double gunRecoilX,
			double gunRecoilY) {
		super();
		this.gunType = gunType;
		this.ammoType = ammoType;
		this.stdMagazineCapacity = stdMagazineCapacity;
		this.caliber = caliber;
		this.gunWeightEmptyGrams = gunWeightEmptyGrams;
		this.gunLength = gunLength;
		this.muzzleLengthMm = muzzleLengthMm;
		this.advMuzzleEnergyJ = advMuzzleEnergyJ;
		this.advMuzzLeVelocityMps = advMuzzLeVelocityMps;
		this.bulletMassGrams = bulletMassGrams;
		this.effectiveRange = effectiveRange;
		this.gunRecoilX = gunRecoilX;
		this.gunRecoilY = gunRecoilY;
	}

	public ResourceObject() {

	}

	public String getGunType() {
		return gunType;
	}

	public void setGunType(String gunType) {
		this.gunType = gunType;
	}

	public String getAmmoType() {
		return ammoType;
	}

	public void setAmmoType(String ammoType) {
		this.ammoType = ammoType;
	}

	public int getStdMagazineCapacity() {
		return stdMagazineCapacity;
	}

	public void setStdMagazineCapacity(int stdMagazineCapacity) {
		this.stdMagazineCapacity = stdMagazineCapacity;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	public double getGunWeightEmptyGrams() {
		return gunWeightEmptyGrams;
	}

	public void setGunWeightEmptyGrams(double gunWeightEmptyGrams) {
		this.gunWeightEmptyGrams = gunWeightEmptyGrams;
	}

	public double getGunLength() {
		return gunLength;
	}

	public void setGunLength(double gunLength) {
		this.gunLength = gunLength;
	}

	public double getMuzzleLengthMm() {
		return muzzleLengthMm;
	}

	public void setMuzzleLengthMm(double muzzleLengthMm) {
		this.muzzleLengthMm = muzzleLengthMm;
	}

	public double getAdvMuzzleEnergyJ() {
		return advMuzzleEnergyJ;
	}

	public void setAdvMuzzleEnergyJ(double advMuzzleEnergyJ) {
		this.advMuzzleEnergyJ = advMuzzleEnergyJ;
	}

	public double getAdvMuzzLeVelocityMps() {
		return advMuzzLeVelocityMps;
	}

	public void setAdvMuzzLeVelocityMps(double advMuzzLeVelocityMps) {
		this.advMuzzLeVelocityMps = advMuzzLeVelocityMps;
	}

	public double getBulletMassGrams() {
		return bulletMassGrams;
	}

	public void setBulletMassGrams(double bulletMassGrams) {
		this.bulletMassGrams = bulletMassGrams;
	}

	public double getEffectiveRange() {
		return effectiveRange;
	}

	public void setEffectiveRange(double effectiveRange) {
		this.effectiveRange = effectiveRange;
	}

	public double getGunRecoilX() {
		return gunRecoilX;
	}

	public void setGunRecoilX(double gunRecoilX) {
		this.gunRecoilX = gunRecoilX;
	}

	public double getGunRecoilY() {
		return gunRecoilY;
	}

	public void setGunRecoilY(double gunRecoilY) {
		this.gunRecoilY = gunRecoilY;
	}

}
