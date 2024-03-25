package com.ngm.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
    private int id;
    private double volume;
    private int cylinders;
    private double power;
    private double torque;
}
