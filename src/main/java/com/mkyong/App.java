package com.mkyong;

import java.math.BigDecimal;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import org.springframework.context.annotation.*;



/// https://mkyong.com/spring-boot/spring-rest-hello-world-example/
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Bean
  CommandLineRunner initDatabase(BookRepository repo) {

    return args -> {
      repo.save(new Book("A Guide to the BennieHill Way of Life", "Bennie Hill", new BigDecimal("15.41")));
      repo.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
      repo.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99")));
    };
  }
}
