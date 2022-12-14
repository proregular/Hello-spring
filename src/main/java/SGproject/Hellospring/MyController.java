package SGproject.Hellospring;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");

        return "hello";
    }

    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("home", "my sweet money");

        return "home";
    }
}
