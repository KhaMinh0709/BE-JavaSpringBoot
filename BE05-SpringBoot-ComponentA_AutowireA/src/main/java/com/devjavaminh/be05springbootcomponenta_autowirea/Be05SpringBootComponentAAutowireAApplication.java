package com.devjavaminh.be05springbootcomponenta_autowirea;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Be05SpringBootComponentAAutowireAApplication {

    public static void main(String[] args) {
        ApplicationContext context = (ApplicationContext) SpringApplication.run(Be05SpringBootComponentAAutowireAApplication.class, args);


        System.out.println("Outfit Instance: " );
        System.out.println("Girl Outfit: " );
    }

}
