package com.monitoring.Presentation.Dto.SupportSession;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SupportSessionResponseDto {
  private String id;
  private String assistedId;
  private String assistedRrdi;
  private String assistedPsid;
  private String assistorId;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private String status;
  private boolean closingRequested;
  private String assistedCountry;
  private String assistedBrand;
  private String assistedOperatorType;
}
