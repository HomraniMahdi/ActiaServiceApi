package com.monitoring.Presentation.Dto.ProductInstaneDto;

import com.monitoring.Presentation.Dto.InactivityDto.InactivityDto;
import com.monitoring.Presentation.Dto.SharedSessionDto.SharedSessionDto;
import com.monitoring.Presentation.Dto.ShutdownRequestDto.ShutdownRequestPrivateResponseDto;
import com.monitoring.Presentation.Dto.VehiculeSessionDto.VehiculeSessionPrivateResponseDto;
import com.monitoring.Presentation.Dto.licenceDto.LicenceDto;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProductsInstanceDto {
    /** Diagnostic session id */
    private String instanceId;

    /** Diagnostic session id */
    private String uuid;

    /** User identifier */
    private String userId;

    /** User type ( RA or OI) */
    private String userType;

    /** VCI Server identifier */
    private String vciServerName;

    /** Diagnostic session status */
    private String status;

    /** RRDI */
    private String rrdi;

    /** PSID */
    private String psid;

    /** Starting date for the diagnostic session */
    private LocalDateTime startRequestDate;

    /** Starting date for the diagnostic session */
    private LocalDateTime startedDate;

    /** Shutdown date for the diagnostic session */
    private LocalDateTime shutdownRequestDate;

    /** Shutdown date for the diagnostic session */
    private LocalDateTime shutdownedDate;

    /** the product instance is launched by an expert * */
    private Boolean diagExpert;

    /** the vehicule identifier number */
    private String vin;
    /** Iframe URL */
    private String uiChannelUrl;

    /** /** User language */
    private String language;

    /** User Country */
    private String country;

    /** ediag server url */
    private String ediagServerUrl;

    /** ediag log level */
    private String ediagLogLevel;

    /** is product instance shared */
    private boolean shared;

    /** is product instance in delegation mode */
    private boolean delegation;

    /** List of product instance license */
    private LicenceDto license;

    /** List of product instance shared sessions */
    private List<SharedSessionDto> sharedSessions;

    /** List of inactivities */
    private List<VehiculeSessionPrivateResponseDto> vehicleSessions;

    /** List of inactivities */
    private List<InactivityDto> inactivities;

    /** List of shutdownRequests */
    private List<ShutdownRequestPrivateResponseDto> shutdownRequests;
}
