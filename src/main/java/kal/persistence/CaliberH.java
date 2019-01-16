package kal.persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name = "Caliber")
@Table(name = "caliber")
public class CaliberH {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String caliber;
	@OneToMany(mappedBy = "caliber")
	private List<FirearmH> firearms;
	@OneToMany(mappedBy = "caliber")
	private List<CartridgeH> cartridges;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	public List<FirearmH> getFirearms() {
		return firearms;
	}

	public void setFirearms(List<FirearmH> firearms) {
		this.firearms = firearms;
	}

	public List<CartridgeH> getCartridges() {
		return cartridges;
	}

	public void setCartridges(List<CartridgeH> cartridges) {
		this.cartridges = cartridges;
	}
}
