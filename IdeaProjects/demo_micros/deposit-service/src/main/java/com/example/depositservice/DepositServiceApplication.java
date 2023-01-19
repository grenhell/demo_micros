package com.example.depositservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableRabbit
@EnableFeignClients
public class DepositServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepositServiceApplication.class, args);
    }

}
