package theoptimisers.citygardeners.Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import theoptimisers.citygardeners.Service.ProductService;
import theoptimisers.citygardeners.Service.UserService;

@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

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
