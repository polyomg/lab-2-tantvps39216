package poly.edu.Lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @GetMapping("/product/formb3")
    public String form(Model model){
        Product product = new Product("Iphone", 20);
        model.addAttribute("product", product);
        return "product/formb3";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute Product product, Model model){
        product.setPrice(product.getPrice()*2);
        model.addAttribute("product", product);
        return "product/formb3";
    }
}
