package theoptimisers.citygardeners;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public Object findAll() { return productRepository.findAll(); }
}
