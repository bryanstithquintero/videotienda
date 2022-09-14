package co.edu.utp.misiontic.bryan.videotienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import co.edu.utp.misiontic.bryan.videotienda.service.CatalogService;
import lombok.extern.slf4j.Slf4j;

//spring mvc

@Controller // esto dice que es un controlador
@Slf4j
public class videoShopController {

        private CatalogService catalogService;

        public videoShopController(CatalogService catalogService) {
                this.catalogService = catalogService;
        }

        @GetMapping("/catalog")
        public String goToCatalog(Model model) { // model es la forma en que se comunica con html para moverme menu
                var categories = this.catalogService.getCategories();

                model.addAttribute("title", "Welcome to my site");
                model.addAttribute("categories", categories);
                return "catalog";
        }

        @GetMapping("/catalog/{id}")
        public String loadCatalogById(@PathVariable("id") Integer id, Model model) {
                log.info("Cargando informacion de categoria {}", id);
                var categories = catalogService.getCategories();
                model.addAttribute("categories", categories);

                var categoryOp = this.catalogService.getCategoryById(id);
                if (categoryOp.isEmpty()) {
                        // mostrar mensaje error
                        model.addAttribute("Error", "la categoria no existe");
                } else {
                        var category = categoryOp.get();

                        model.addAttribute("title", category.getName());
                        model.addAttribute("id", category.getId());

                        var categoryMovies = this.catalogService.getMoviesByCategoryId(id);

                        model.addAttribute("movies", categoryMovies);
                }

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
