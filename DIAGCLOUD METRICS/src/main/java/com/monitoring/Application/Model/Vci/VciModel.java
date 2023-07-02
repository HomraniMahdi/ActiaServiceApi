package com.monitoring.Application.Model.Vci;


import lombok.Data;

@Data
public class VciModel {
    private String uuid;

    private String rrdi;
    private String psid;
    private String name;
    private String status;
    private String pinCodeId;
    private String hardwareId;
    private String apiKeyId;
    private String version;
    private String pinCode;
    private String hardcodedSecret;

}
