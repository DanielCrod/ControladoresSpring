package Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("mensaje","¡Hola a todos!");
        return "index";
    }

    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("saludo", "Hola");
        return "saludo";
    }

}
