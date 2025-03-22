package com.example.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
    }
}

@RestController
class TimeController {

    @GetMapping("/time")
    public String getCurrentTime() {
        String appName = "TestApp";
        String version = "1.0.1";

        long currentTime = System.currentTimeMillis() / 1000;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(new Date(currentTime * 1000));

        return String.format("Application Name: %s\nVersion: %s\nCurrent Time: %s (%d seconds since epoch)",
                appName, version, formattedDate, currentTime);
    }
}

