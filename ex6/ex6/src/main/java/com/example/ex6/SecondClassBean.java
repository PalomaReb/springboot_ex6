package com.example.ex6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SecondClassBean {

@Bean
    CommandLineRunner secondBeanExecuted(){
    return command -> {
        System.out.println("Hola desde la segunda clase, ahora me ejecuto yo!");
    };

    }
}
