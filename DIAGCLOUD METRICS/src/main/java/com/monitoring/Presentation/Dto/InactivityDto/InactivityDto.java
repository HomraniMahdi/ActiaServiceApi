package com.monitoring.Presentation.Dto.InactivityDto;

import com.monitoring.Presentation.Dto.HeritChildDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InactivityDto extends HeritChildDto {
    /** Detection Date */
    private LocalDateTime detectionDate;

    /** Cancellation Date */
    private LocalDateTime cancellationDate;
}
