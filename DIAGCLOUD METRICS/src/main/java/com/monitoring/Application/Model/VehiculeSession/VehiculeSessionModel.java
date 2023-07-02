package com.monitoring.Application.Model.VehiculeSession;

import lombok.Data;

@Data
public class VehiculeSessionModel {
    private String instanceId;
    private String operationId;
    private String vin;
    private String brand;
    private String model;
}
