package uns.pmf.konfback.entity;

import org.springframework.context.annotation.Lazy;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Organizator extends Osoba {

	protected Organizator() {};
	
	public Organizator(String email, String ime, String prezime) {
		super(email,ime,prezime);
	}
	@Lazy
	@OneToMany(mappedBy="organizator")
	private List<Konferencija> konferencije = new ArrayList<Konferencija>();

	public List<Konferencija> getKonferencije() {
		return konferencije;
	}

	public void setKonferencije(List<Konferencija> konferencije) {
		this.konferencije = konferencije;
	}

	@Override
	public String toString() {
		return "Organizator [getId()="
				+ getId() + ", getEmail()=" + getEmail() + ", getIme()=" + getIme() + ", getPrezime()=" + getPrezime()
				+  "]";
	}
	
	
}
