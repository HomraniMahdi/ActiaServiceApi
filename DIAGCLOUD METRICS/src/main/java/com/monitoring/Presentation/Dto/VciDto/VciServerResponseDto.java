package com.monitoring.Presentation.Dto.VciDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class VciServerResponseDto {
  private String name;
  private String status;
  private String id;
  private String hardwareId;
  private String apiKeyId;
}
