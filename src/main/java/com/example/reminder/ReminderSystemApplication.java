//ReminderSystemApplication.java
package com.example.reminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReminderSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReminderSystemApplication.class, args);
    }
}