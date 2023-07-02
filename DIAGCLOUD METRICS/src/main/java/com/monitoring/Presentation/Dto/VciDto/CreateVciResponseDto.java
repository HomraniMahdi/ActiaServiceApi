package com.monitoring.Presentation.Dto.VciDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateVciResponseDto {
  @JsonProperty("api-key")
  private String apikey;
}
