package com.example.springboot;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BMWM3 {

    private String carName;
    private IEngine engine;
    private List<String> features;
    private Map<String,Double> modelPricing;


    public BMWM3(String carName, IEngine engine, List<String> features, Map<String, Double> modelPricing) {
        this.carName = carName;
        this.engine = engine;
        this.features = features;
        this.modelPricing = modelPricing;
    }
}
