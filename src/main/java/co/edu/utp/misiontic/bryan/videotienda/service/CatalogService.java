package co.edu.utp.misiontic.bryan.videotienda.service;

import java.util.List;
import java.util.Optional;

import co.edu.utp.misiontic.bryan.videotienda.controller.dto.CategoryDto;
import co.edu.utp.misiontic.bryan.videotienda.controller.dto.ContactDto;
import co.edu.utp.misiontic.bryan.videotienda.controller.dto.MovieDto;

public interface CatalogService {
    List<CategoryDto> getCategories();

    Optional<CategoryDto> getCategoryById(Integer id);

    List<MovieDto> getMoviesByCategoryId(Integer CategoryId);

    void saveContact(ContactDto contactInfo);

    MovieDto getMovieById(String id);
}
