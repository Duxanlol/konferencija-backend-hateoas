package uns.pmf.konfback.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Smestaj {

	@Id
	@GeneratedValue
	private long id;
	
	private String naziv;
	
    @OneToMany(
            mappedBy = "smestaj")
	private List<Soba> sobe = new ArrayList<Soba>();
	
	@OneToOne
	private PredstavnikSmestaja predstavnik;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Soba> getSobe() {
		return sobe;
	}

	public void setSobe(List<Soba> sobe) {
		this.sobe = sobe;
	}

	public PredstavnikSmestaja getPredstavnik() {
		return predstavnik;
	}

	public void setPredstavnik(PredstavnikSmestaja predstavnik) {
		this.predstavnik = predstavnik;
	}

	
}
