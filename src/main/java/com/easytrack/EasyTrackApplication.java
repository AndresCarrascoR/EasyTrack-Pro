// Archivo: src/main/java/com/easytrack/EasyTrackApplication.java
package com.easytrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EasyTrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyTrackApplication.class, args);
    }
}
