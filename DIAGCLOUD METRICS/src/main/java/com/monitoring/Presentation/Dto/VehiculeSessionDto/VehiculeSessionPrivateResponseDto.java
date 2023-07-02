package com.monitoring.Presentation.Dto.VehiculeSessionDto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class VehiculeSessionPrivateResponseDto {

    /** Vehicle session created date */
    private LocalDateTime identificationDate;
    /** Vehicle Identification Number */
    private String vin;

    /** Vehicle Brand */
    private String brand;

    /** Vehicle Model */
    private String model;
}
