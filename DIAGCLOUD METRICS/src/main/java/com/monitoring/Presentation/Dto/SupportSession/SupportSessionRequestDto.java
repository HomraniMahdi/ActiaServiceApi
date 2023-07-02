package com.monitoring.Presentation.Dto.SupportSession;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;



@Data
public class SupportSessionRequestDto {
  @NotEmpty
  private String status;
}
