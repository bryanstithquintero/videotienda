package co.edu.utp.misiontic.bryan.videotienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//spring mvc

@Controller // esto dice que es un controlador
public class videoShopController {
    @GetMapping("/catalog")
    public String goToCatalog(Model model) { // model es la forma en que se comunica con html para moverme menu
        return "catalog";
    }

    @GetMapping("/contact")
    public String goToContact(Model model) {
        return "contact";
    }

    @GetMapping("/login")
    public String goToLogin(Model model) {
        return "login";
    }
}
