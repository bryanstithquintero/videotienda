package co.edu.utp.misiontic.bryan.videotienda.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {
    private String username;

    private String name;

    private String email;

    private Boolean admin;

}
