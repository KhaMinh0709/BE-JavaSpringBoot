package com.devjavaminh.be07springbootservicerepositorycomponent;

import com.devjavaminh.be07springbootservicerepositorycomponent.model.Girl;
import com.devjavaminh.be07springbootservicerepositorycomponent.service.GirlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Be07SpringBootServiceRepositoryComponentApplication {

    public static void main(String[] args) {
        SpringApplication.run(Be07SpringBootServiceRepositoryComponentApplication.class, args);

        GirlService girlService = new GirlService();
        Girl girl = new Girl();
        girlService.getRandomGirl();
        System.out.println(girl);
    }

}
