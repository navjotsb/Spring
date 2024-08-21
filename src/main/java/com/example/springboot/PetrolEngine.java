package com.example.springboot;
import lombok.Data;
@Data
public class PetrolEngine implements IEngine{

    private String engineType = "Petrol Engine";

    private Integer horsePower = 450;


    @Override
    public void display() {
        System.out.println("Engine Type: " + engineType + " Horse Power: " + horsePower);
    }
}
