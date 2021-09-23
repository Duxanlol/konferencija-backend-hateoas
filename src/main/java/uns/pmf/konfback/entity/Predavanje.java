package uns.pmf.konfback.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Predavanje {
	
	@Id
	@GeneratedValue
	private long Id;
	
	private String naziv;
	private String opis;
	
	@ManyToOne
	private Predavac predavac;
	
	@OneToMany(mappedBy="predavanje")
	@JsonIgnore
	private List<Izvodjenje> izvodjenja = new ArrayList<Izvodjenje>();
	
	@ManyToOne
	private Konferencija konferencija;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Predavac getPredavac() {
		return predavac;
	}

	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}

	public List<Izvodjenje> getIzvodjenja() {
		return izvodjenja;
	}

	public void setIzvodjenja(List<Izvodjenje> izvodjenja) {
		this.izvodjenja = izvodjenja;
	}

	public Konferencija getKonferencija() {
		return konferencija;
	}

	public void setKonferencija(Konferencija konferencija) {
		this.konferencija = konferencija;
	}
	
	
}
