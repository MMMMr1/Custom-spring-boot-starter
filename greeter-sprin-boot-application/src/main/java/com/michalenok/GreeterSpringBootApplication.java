package com.michalenok;

import com.michalenok.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterSpringBootApplication implements CommandLineRunner {

    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(GreeterSpringBootApplication.class, args);
    }


    public void run(String... args) throws Exception {
        String message = greeter.greet();
        System.out.println(message);
    }
}
