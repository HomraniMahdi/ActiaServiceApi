package com.monitoring.Presentation.Dto.ProductInstaneDto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
public class ProductInstancePrivateRequestDto {
    @NotEmpty
    private String status;
}
