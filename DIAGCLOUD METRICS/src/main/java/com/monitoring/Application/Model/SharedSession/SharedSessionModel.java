package com.monitoring.Application.Model.SharedSession;

import com.monitoring.Application.Model.HeritChild;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SharedSessionModel extends HeritChild {
    private String supportSessionId;
    private String operationId;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean forcedShutdown;
    private String assistorId;
    private String productInstanceId;
}
