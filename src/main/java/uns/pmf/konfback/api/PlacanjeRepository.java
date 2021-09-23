package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Placanje;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "placanja", path = "placanja")
public interface PlacanjeRepository extends PagingAndSortingRepository<Placanje, Long> {
	Placanje findById(long id);    
}
