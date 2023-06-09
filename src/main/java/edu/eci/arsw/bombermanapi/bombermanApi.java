package edu.eci.arsw.bombermanapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.bomberman"})
public class bombermanApi {

    public static void main(String[] args) {
        SpringApplication.run(bombermanApi.class, args);
    }
}
