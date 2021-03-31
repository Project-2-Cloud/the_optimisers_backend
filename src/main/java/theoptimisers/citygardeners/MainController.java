package theoptimisers.citygardeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
