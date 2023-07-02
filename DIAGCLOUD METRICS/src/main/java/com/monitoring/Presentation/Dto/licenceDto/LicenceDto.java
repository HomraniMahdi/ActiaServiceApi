package com.monitoring.Presentation.Dto.licenceDto;

import com.monitoring.Presentation.Dto.HeritChildDto;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class LicenceDto extends HeritChildDto {
    /** User PSID */
    private String psid;

    /** User RRDI */
    private String rrdi;

    /** The license label */
    private String profile;

    /** Virtual Computer ID */
    private String vcid;

    /** The license type */
    private String type;

    /** License activation date */
    private LocalDateTime activationDate;

    /** License deactivation date */
    private LocalDateTime deactivationDate;

    /** License activation failure date */
    private LocalDateTime activationFailureDate;
}
