package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Organizator;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "organizator", path = "organizator")
public interface OrganizatorRepository extends PagingAndSortingRepository<Organizator, Long> {
	Organizator findById(long id);


}
