package co.edu.utp.misiontic.bryan.videotienda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.misiontic.bryan.videotienda.controller.dto.MovieDto;
import co.edu.utp.misiontic.bryan.videotienda.service.CatalogService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/movie")
public class MovieRestController {

    private CatalogService catalogService;

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable("id") String movieCode) {

        var movie = catalogService.getMovieById(movieCode);

        return ResponseEntity.ok().body(movie);
    }
}
