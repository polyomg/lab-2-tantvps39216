package poly.edu.Lab2.Controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class b4ProductController {
    @GetMapping("/product/formb4")
    public String form(Model model) {
        Product p = new Product();
        p.setName("iPhone 30");
        p.setPrice(5000.0);
        model.addAttribute("p1", p);
        model.addAttribute("p2", new Product());
        return "product/formb4";
    }
    @PostMapping("/product/saveb4")
    public String save(@ModelAttribute("p2") Product p, Model model) {
        model.addAttribute("p1", new Product("iPhone 17", 5000));
        model.addAttribute("p2", p);
        return "product/formb4";
    }

    @ModelAttribute("items")
    public List<Product> getItems() {
        return Arrays.asList(new Product("A", 1), new Product("B", 12));
    }
}
