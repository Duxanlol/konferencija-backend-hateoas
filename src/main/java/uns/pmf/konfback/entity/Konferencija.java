package uns.pmf.konfback.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Konferencija {
	@Id
	@GeneratedValue
	private long Id;
	
	@ManyToOne
	@JsonIgnore
	private Organizator organizator;
	
    @OneToMany(mappedBy = "konferencija")
	private List<Izvodjenje> izvodjenja = new ArrayList<Izvodjenje>();
    
    @OneToMany(mappedBy = "konferencija")
    private List<Predavanje> predavanja = new ArrayList<Predavanje>();

	private String naziv;
	
	private String opis;
	
	private Double cena;
	
	private LocalDate pocetak;
	
	private LocalDate kraj;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public Organizator getOrganizator() {
		return organizator;
	}

	public void setOrganizator(Organizator organizator) {
		this.organizator = organizator;
	}

	public List<Izvodjenje> getIzvodjenja() {
		return izvodjenja;
	}

	public void setIzvodjenja(List<Izvodjenje> izvodjenja) {
		this.izvodjenja = izvodjenja;
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

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	public LocalDate getPocetak() {
		return pocetak;
	}

	public void setPocetak(LocalDate pocetak) {
		this.pocetak = pocetak;
	}

	public LocalDate getKraj() {
		return kraj;
	}

	public void setKraj(LocalDate kraj) {
		this.kraj = kraj;
	}
	
	public List<Predavanje> getPredavanja() {
		return predavanja;
	}

	public void setPredavanja(List<Predavanje> predavanja) {
		this.predavanja = predavanja;
	}

	
}
