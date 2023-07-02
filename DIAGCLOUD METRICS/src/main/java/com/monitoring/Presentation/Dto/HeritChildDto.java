package com.monitoring.Presentation.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class HeritChildDto {
    /** table identifier */
    protected long id;

    /** Aggregate identifier */
    protected String uuid;

    /** Aggregate Created by */
    protected String createdBy;

    /** Aggregate Created Date */
    protected LocalDateTime createdDate;

}
