package uns.pmf.konfback.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Primanje {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JsonIgnore
	private Osoba osoba;


	public Primanje() {
		
	}
	
	public Primanje(Osoba osoba) {
		super();
		this.osoba = osoba;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}
	
	
}
