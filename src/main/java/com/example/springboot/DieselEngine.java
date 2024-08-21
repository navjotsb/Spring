package com.example.springboot;

import lombok.Data;
@Data
public class DieselEngine implements IEngine{
    private String engineType = "Diesel Engine";

    private Integer horsePower = 500;


    @Override
    public void display() {
        System.out.println("Engine Type: " + engineType + " Horse Power: " + horsePower);
    }
}

