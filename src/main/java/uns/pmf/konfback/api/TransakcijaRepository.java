package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Transakcija;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "transakcija", path = "transakcija")

public interface TransakcijaRepository extends PagingAndSortingRepository<Transakcija, Long> {
	Transakcija findById(long id);

}
