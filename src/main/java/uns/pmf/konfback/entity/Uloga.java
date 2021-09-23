package uns.pmf.konfback.entity;

import org.springframework.context.annotation.Lazy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Uloga implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -341143635179298280L;

	@Id
	@GeneratedValue
	private int id;
	
	private String naziv;
	@Lazy
	@OneToMany(mappedBy = "uloga")
	private Set<Osoba> osobe = new HashSet<Osoba>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void addOsoba(Osoba osoba) {
		this.osobe.add(osoba);
	}
	

}
