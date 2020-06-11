package com.gy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.gy.system.annotation.EnableRyFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.gy.*.mapper")
@EnableRyFeignClients
public class GyGenApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(GyGenApp.class, args);
    }
}
