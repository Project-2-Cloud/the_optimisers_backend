package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.ProductRepository;
import theoptimisers.citygardeners.Model.Product;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Object findAll() { return productRepository.findAll(); }

    public Product addVegetable(Product product) { return productRepository.save(product); }
}
