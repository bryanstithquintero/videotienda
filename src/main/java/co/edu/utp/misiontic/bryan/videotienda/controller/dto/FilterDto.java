package co.edu.utp.misiontic.bryan.videotienda.controller.dto;

import java.util.List;

import lombok.Data;

@Data
public class FilterDto {
    private List<String> school;
    private List<String> type;
}
