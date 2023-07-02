package com.monitoring.Presentation.Dto.VciDto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


import javax.validation.constraints.Size;

@Data
public class VciRequestDto {
  @NotEmpty
  @Size(min = 6, max = 6)
  private String pinCode;

  @NotEmpty private String hardwareId;
  @NotEmpty private String hardcodedSecret;
}
