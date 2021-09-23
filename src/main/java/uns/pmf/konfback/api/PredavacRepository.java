package uns.pmf.konfback.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Predavac;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "predavac", path = "predavac")
public interface PredavacRepository extends PagingAndSortingRepository<Predavac, Long> {
	Predavac findById(long id);
}
