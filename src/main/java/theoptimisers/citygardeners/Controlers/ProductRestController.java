package theoptimisers.citygardeners.Controlers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theoptimisers.citygardeners.Model.Product;
import theoptimisers.citygardeners.Service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/product")
@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(
                        "Apple",
                        "Just a red apple",
                        "https://www.google.com/search?q=red+apple&rlz=1C1CHBF_nlBE913BE913&sxsrf=ALeKk00D-Nj8q-iAOhjuDwitqR0BXFZhBQ:1617112495553&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjFr---ldjvAhWhhf0HHRqkCB4Q_AUoAXoECAEQAw&biw=1536&bih=698#imgrc=BFX69DIdKejkVM",
                        2
                )
        );
    }

}