package com.monitoring.Application.Model.Inactivity;

import com.monitoring.Application.Model.HeritChild;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class InactivityModel extends HeritChild {
    /** Detection Date */
    private LocalDateTime detectionDate;

    /** Cancellation Date */
    private LocalDateTime cancellationDate;
}
