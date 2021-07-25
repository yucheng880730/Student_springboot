package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Leo = new Student(
                    "Leo",
                    "yucheng2k13@gmail.com",
                    LocalDate.of(1999, Month.JULY, 30),
                    21
            );

            Student Alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2003, Month.JULY, 15),
                    21
            );

            repository.saveAll(
                    List.of(Leo, Alex)
            );
        };
    }
}
