package uns.pmf.konfback.api;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uns.pmf.konfback.entity.Karta;
import uns.pmf.konfback.entity.Mesto;
import uns.pmf.konfback.entity.Polaznik;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "mesto", path = "mesto")
public interface MestoRepository extends PagingAndSortingRepository<Mesto, Long> {
	Mesto findById(long id);
	List<Mesto> findAllByKarta(Karta karta);

}
