package uns.pmf.konfback.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Predavac extends Osoba {
   
	protected Predavac() {};
	
	public Predavac(String email, String ime, String prezime) {
		super(email,ime,prezime);
	}
	@JsonIgnore
	@OneToMany(
            mappedBy = "predavac")
	List<Predavanje> predavanja = new ArrayList<Predavanje>();

	public List<Predavanje> getPredavanja() {
		return predavanja;
	}

	public void setPredavanja(List<Predavanje> predavanja) {
		this.predavanja = predavanja;
	}

	@Override
	public String toString() {
		return "Predavac [getId()=" + getId() + ", getEmail()=" + getEmail()
				+ ", getIme()=" + getIme() + ", getPrezime()=" + getPrezime() +"]";
	}
	
}
