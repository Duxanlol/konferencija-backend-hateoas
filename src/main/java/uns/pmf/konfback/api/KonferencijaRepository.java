package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import uns.pmf.konfback.entity.Konferencija;
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "konferencija", path = "konferencija")
public interface KonferencijaRepository extends PagingAndSortingRepository<Konferencija, Long> {
	Konferencija findById(long id);

}
