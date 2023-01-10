package com.example.demo;

import com.example.demo.entity.Person;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@CommonsLog
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            Person person = new Person();
            person.setName("bob");
            log.info(person.getName());
        };
    }
}
