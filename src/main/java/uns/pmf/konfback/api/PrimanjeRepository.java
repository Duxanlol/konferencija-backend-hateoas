package uns.pmf.konfback.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Primanje;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "primanje", path = "primanje")
public interface PrimanjeRepository extends PagingAndSortingRepository<Primanje, Long> {
	Primanje findById(long id);    
}
