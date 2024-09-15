package com.devjavaminh.be08springbootcomponentscan;

import com.devjavaminh.be08springbootcomponentscan.other.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Be08SpringBootComponentScanApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Be08SpringBootComponentScanApplication.class, args);

        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            if (otherGirl != null) {
                System.out.println("Bean: " + otherGirl.toString());
            }
        } catch (Exception e) {
            System.out.println("Bean OtherGirl không tồn tại");
        }
    }
}
