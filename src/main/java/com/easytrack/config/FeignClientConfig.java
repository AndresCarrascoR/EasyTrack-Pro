// Archivo: src/main/java/com/easytrack/config/FeignClientConfig.java
package com.easytrack.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class FeignClientConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            // Agregar encabezados personalizados si es necesario
            // requestTemplate.header("Authorization", "Bearer token");
        };
    }
}
