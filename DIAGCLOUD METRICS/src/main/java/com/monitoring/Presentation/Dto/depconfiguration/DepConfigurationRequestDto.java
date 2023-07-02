package com.monitoring.Presentation.Dto.depconfiguration;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;



@Data
public class DepConfigurationRequestDto {
  @NotEmpty
  private String configValue;
  @NotEmpty private String configType;
}
