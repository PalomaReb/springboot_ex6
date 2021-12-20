package com.example.ex6;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ThirdClassBean {
    @Bean
    CommandLineRunner thirdBeanExcuted(){
        return thirdBean -> {
            System.out.println("Hola soy el tercer Bean");
        };

        }

    //@Override
    public void run (String...args) throws Exception {
        System.out.println("Bean argument" + args);
    }

}
