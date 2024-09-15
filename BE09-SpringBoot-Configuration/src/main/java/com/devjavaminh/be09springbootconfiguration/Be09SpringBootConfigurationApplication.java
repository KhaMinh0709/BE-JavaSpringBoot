package com.devjavaminh.be09springbootconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Be09SpringBootConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Be09SpringBootConfigurationApplication.class, args);

		MyBean myBean = context.getBean(MyBean.class);
		System.out.println(myBean.getMess());
	}

}
