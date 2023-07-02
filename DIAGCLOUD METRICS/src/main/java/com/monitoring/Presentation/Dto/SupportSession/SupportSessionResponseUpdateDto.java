package com.monitoring.Presentation.Dto.SupportSession;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class SupportSessionResponseUpdateDto {
  private String id;
  private String assistedId;
  private String assistedRrdi;
  private String assistedPsid;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private String status;
  private boolean closingRequested;
}
