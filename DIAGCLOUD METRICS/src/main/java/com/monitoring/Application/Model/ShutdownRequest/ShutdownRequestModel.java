package com.monitoring.Application.Model.ShutdownRequest;

import com.monitoring.Application.Model.HeritChild;
import lombok.Data;


import java.time.LocalDateTime;

@Data

public class ShutdownRequestModel extends HeritChild {

  private LocalDateTime shutdownRequestDate;
  private String operationId;
  private String clientId;
  private String shutdownContext;
  private String evaluatedStatus;
  private boolean bypassedEvaluation;
  private String bypassReason;
  private String evaluationResult;
  private LocalDateTime wdbShutdownResponseDate;
  private String wdbShutdownResponseType;
  private LocalDateTime wdbShutdownRequestDate;
}
