package com.grib.api.gateway.apispringgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ApiSpringGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSpringGatewayApplication.class, args);
    }

}
