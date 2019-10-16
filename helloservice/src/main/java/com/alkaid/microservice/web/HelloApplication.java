package com.alkaid.microservice.web;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] argv) {
        new SpringApplicationBuilder(HelloApplication.class).web(WebApplicationType.SERVLET).run(argv);
    }
}
