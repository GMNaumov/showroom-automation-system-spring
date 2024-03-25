package com.ngm.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehicleType {
    private String vin;
    private VehicleType vehicleType;
    private Engine engine;
    private String brand;
    private String model;
    private int year;
    private String color;
    private byte[] photo;
}
