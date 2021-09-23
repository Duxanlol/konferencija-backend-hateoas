package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.PredstavnikSmestaja;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "predstavnik", path = "predstavnik")
public interface PredstavnikSmestajaRepository extends PagingAndSortingRepository<PredstavnikSmestaja, Long> {

}
