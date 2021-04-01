package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
