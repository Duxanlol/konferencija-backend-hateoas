package uns.pmf.konfback.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Osoba;
import uns.pmf.konfback.entity.Placanje;
import uns.pmf.konfback.entity.Primanje;
import uns.pmf.konfback.entity.Transakcija;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@CrossOrigin
public class TransakcijaRepositoryImpl {

		@Autowired
		EntityManager em;
		
		public void insert(Transakcija transakcija) {
			em.persist(transakcija);
		}
		
		public void izvrsiTransakciju(Osoba izvor, Osoba destinacija, double iznos, String valuta, String svrha) {
			Placanje placanjeIzvor = new Placanje(izvor);
			Primanje primanjeDestinacija = new Primanje(destinacija);
			Transakcija novaTransakcija = new Transakcija(placanjeIzvor, primanjeDestinacija, iznos, valuta, svrha);
			em.persist(placanjeIzvor);
			em.persist(primanjeDestinacija);
			em.persist(novaTransakcija);
		}
		
		public List<Transakcija> sveTransakcije(){
			return em.createQuery("select t from Transakcija t", Transakcija.class).getResultList();
		}
}
