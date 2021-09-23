package uns.pmf.konfback.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Predavanje;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "predavanje", path = "predavanje")
public interface PredavanjeRepository extends PagingAndSortingRepository<Predavanje, Long> {
	Predavanje findById(long id);

}
