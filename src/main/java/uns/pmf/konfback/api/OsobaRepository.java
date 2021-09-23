package uns.pmf.konfback.api;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Osoba;

import java.util.List;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "osoba", path = "osoba")
public interface OsobaRepository extends PagingAndSortingRepository<Osoba, Long> {
	Osoba findById(long id);
    
	@Query("select distinct o.osobaDType from Osoba o")
	List<String> findAllOsobaTypes();
	
	Osoba findByEmail(String email);

	
	


}
