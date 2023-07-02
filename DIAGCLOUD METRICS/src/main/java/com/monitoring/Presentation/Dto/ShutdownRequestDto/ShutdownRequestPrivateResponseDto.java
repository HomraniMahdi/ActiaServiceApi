package com.monitoring.Presentation.Dto.ShutdownRequestDto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ShutdownRequestPrivateResponseDto {
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
