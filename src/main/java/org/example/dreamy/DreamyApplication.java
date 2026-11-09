package org.example.dreamy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DreamyApplication {

    public static void main(String[] args) {
        System.out.println("CSS FIL: " + DreamyApplication.class.getClassLoader().getResource("static/style.css"));
        SpringApplication.run(DreamyApplication.class, args);
    }

}
