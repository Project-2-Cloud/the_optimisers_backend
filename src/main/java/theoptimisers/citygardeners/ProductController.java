package theoptimisers.citygardeners;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(
                        "1",
                        "Apple",
                        "Just a red apple",
                        "https://www.google.com/search?q=red+apple&rlz=1C1CHBF_nlBE913BE913&sxsrf=ALeKk00D-Nj8q-iAOhjuDwitqR0BXFZhBQ:1617112495553&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjFr---ldjvAhWhhf0HHRqkCB4Q_AUoAXoECAEQAw&biw=1536&bih=698#imgrc=BFX69DIdKejkVM",
                        5,
                        2
                )
        );
    }
}