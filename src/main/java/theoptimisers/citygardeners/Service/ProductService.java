package theoptimisers.citygardeners.Service;

import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.ProductRepository;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public Object findAll() { return productRepository.findAll(); }
}
