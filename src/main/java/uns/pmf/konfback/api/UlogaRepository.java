package uns.pmf.konfback.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Uloga;
import java.util.List;
import java.util.Optional;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "uloga", path = "uloga")
public interface UlogaRepository extends PagingAndSortingRepository<Uloga, Integer> {

    List<Uloga> findAll();
    Optional<Uloga> findById(@Param("id") int id);
    Uloga findByNaziv(String naziv);
}
