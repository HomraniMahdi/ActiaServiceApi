package com.monitoring.Presentation.Dto.SharedSessionDto;

import com.monitoring.Presentation.Dto.HeritChildDto;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SharedSessionDto extends HeritChildDto {
    private String supportSessionId;
    private String operationId;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean forcedShutdown;
    private String assistorId;
    private String productInstanceId;
}
