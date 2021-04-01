package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
