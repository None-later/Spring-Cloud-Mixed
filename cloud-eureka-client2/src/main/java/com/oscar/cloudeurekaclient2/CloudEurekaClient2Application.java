package com.oscar.cloudeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClient2Application.class, args);
    }

}
