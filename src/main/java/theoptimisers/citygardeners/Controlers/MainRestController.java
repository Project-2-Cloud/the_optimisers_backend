package theoptimisers.citygardeners.Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import theoptimisers.citygardeners.Model.*;
import theoptimisers.citygardeners.Service.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/mainRestController")
@RestController
public class MainRestController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    @Autowired
    private ContactPointService contactPointService;
    @Autowired
    private ForSaleService forSaleService;
    @Autowired
    private SaleService saleService;
    @Autowired
    private UserContactPointService userContactPointService;
    @Autowired
    private UserWorkshopService userWorkshopService;
    @Autowired
    private WorkshopService workshopService;

    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

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


    @RequestMapping("/contactPoints")
    public List<ContactPoint> getAllContactPoints() {
        return contactPointService.getAll();
    }

    @RequestMapping("/workshops")
    public List<Workshop> getAllWorkshops() {
        return workshopService.getAll();
    }

    @RequestMapping("/workshopsFromUser")
    public List<Workshop> getAllWorkshopsFromUser(Iterable<Long> userid) {
        return workshopService.getAllFromUser(userid);
    }

    @PostMapping("/addVegetable")
    public void addVegetable(@Valid @RequestBody Product product) throws Exception {
        try {
            productService.addVegetable(product);
        } catch (ServiceException e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping("/addSale")
    public void addSale(@Valid @RequestBody Sale sale) throws Exception {
        try {
            saleService.addSale(sale);
        } catch (ServiceException e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping("/addUser")
    public void addUser(@Valid @RequestBody User user) throws Exception {
        try {
            userService.addUser(user);
        } catch (ServiceException e) {
            throw new Exception(e.getMessage());
        }
    }
}
