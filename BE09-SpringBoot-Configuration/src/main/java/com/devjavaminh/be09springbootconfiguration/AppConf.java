package com.devjavaminh.be09springbootconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {
    @Bean
    public MyBean mybean(){
        return new MyBean();
    }
}
