package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Karta;
import uns.pmf.konfback.entity.Polaznik;

import java.util.List;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "karta", path = "karta")
public interface KartaRepository extends PagingAndSortingRepository<Karta, Long> {
	Karta findById(long id);
	List<Karta> findAllByPolaznik(Polaznik polaznik);

}
