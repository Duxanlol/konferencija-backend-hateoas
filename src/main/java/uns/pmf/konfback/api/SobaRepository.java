package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Soba;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "soba", path = "soba")
public interface SobaRepository extends PagingAndSortingRepository<Soba, Long> {
	Soba findById(long id);

}
