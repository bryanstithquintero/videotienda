package co.edu.utp.misiontic.bryan.videotienda.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private String id;
    private String name;
    private Integer categoryId;
    private String description;
    private Integer length;
    private Double price;
    private String imageUrl;
}
