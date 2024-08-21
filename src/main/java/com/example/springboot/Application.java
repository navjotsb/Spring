package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

//        BMWM3 m3= new BMWM3();
//        BMWM3 m4= new BMWM3();
//        System.out.println(m3);
//        System.out.println(m4);
        //SpringApplication.run(Application.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BMWM3 m3 = (BMWM3) context.getBean(BMWM3.class);
        System.out.println(m3);
    }

}
