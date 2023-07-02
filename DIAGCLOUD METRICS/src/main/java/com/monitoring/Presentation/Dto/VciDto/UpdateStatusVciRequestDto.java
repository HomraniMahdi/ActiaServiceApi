package com.monitoring.Presentation.Dto.VciDto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
public class UpdateStatusVciRequestDto {
  @NotEmpty
  private String status;
}
