package com.example.springboot;
import lombok.Data;
@Data
public class BMWM3 {

    private String carName;
    private IEngine engine;

    public BMWM3(IEngine engine, String carName)
    {
        this.engine= engine;
             this.carName =carName;

    }


}
