package theoptimisers.citygardeners.Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import theoptimisers.citygardeners.Service.*;

@Controller
public class MainController {

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
    @GetMapping("/overview-vegetables")
    public String showVegetablesOverview(Model model) {
        model.addAttribute("vegetables", productService.findAll());
        return "overview";
    }

}
