package com.monitoring.Application.Model.depconfiguration;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class DepConfigurationModel {
    /** dep configuration value */
    private String configValue;

    /** dep configuration type */
    private String configType;

    /** dep update date */
    private LocalDateTime updateDate;
    protected long id;

    /** Aggregate identifier */
    protected String uuid;

    /** Aggregate version */
    protected int etag;

    /** Aggregate Created by */
    protected String createdBy;

    /** Aggregate Created Date */
    protected LocalDateTime createdDate;
}
