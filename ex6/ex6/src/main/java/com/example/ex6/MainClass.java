package com.example.ex6;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class MainClass {

    @PostConstruct
    void firstBean() {
        System.out.println("Soy el primer BEAN! HOLA -- desde clase Main");

    }
}
