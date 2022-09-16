package co.edu.utp.misiontic.bryan.videotienda.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private Long code;

    private String name;
    private String description;
    private Integer length;
    private String imageUrl;

    @ManyToOne
    private Category category;
}
