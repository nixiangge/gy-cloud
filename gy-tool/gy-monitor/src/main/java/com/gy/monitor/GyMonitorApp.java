package com.gy.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class GyMonitorApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(GyMonitorApp.class, args);
    }
}