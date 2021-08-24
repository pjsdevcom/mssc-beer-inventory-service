package com.pjsdev.msscbeerinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication
public class MsscBeerInventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerInventoryServiceApplication.class, args);
    }

}
