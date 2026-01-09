package poly.edu.Lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class b1Controller {
    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }
    @PostMapping("/ctrl/ok")
    public String m1(Model model) {
        model.addAttribute("mes","Đây là m1");
        return "ok";
    }

    @GetMapping("/ctrl/ok")
    public String m2(Model model) {
        model.addAttribute("mes", "Đây là m2");
        return "ok";
    }

//    @PostMapping("/ctrl/ok/{x}")
//    public String m3(Model model, @PathVariable("x") String x) {
//        model.addAttribute("mes","Đây là m3 "+x);
//        return "ok";
//    }

    @PostMapping(value = "/ctrl/ok", params = "x")
    public String m3(Model model, @RequestParam("x") String x){
        model.addAttribute("mes", "Đây là m3 = "+ x);
        return "ok";
    }
}
