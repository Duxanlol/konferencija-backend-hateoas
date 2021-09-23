package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import uns.pmf.konfback.entity.Izvodjenje;


@CrossOrigin(origins = "http://localhost:4200",
		methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
		@RepositoryRestResource(collectionResourceRel = "izvodjenje", path = "izvodjenje")
public interface IzvodjenjeRepository extends PagingAndSortingRepository<Izvodjenje, Long> {
	Izvodjenje findById(long id);

}
