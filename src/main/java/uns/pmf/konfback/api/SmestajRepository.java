package uns.pmf.konfback.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Smestaj;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "smestaj", path = "smestaj")
public interface SmestajRepository extends PagingAndSortingRepository<Smestaj, Long> {
    Optional<Smestaj> findById(@Param("id") Long id);
    List<Smestaj> findAll();
}
