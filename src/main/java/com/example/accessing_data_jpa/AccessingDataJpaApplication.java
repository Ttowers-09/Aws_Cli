package com.example.accessing_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

  private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataJpaApplication.class, args);
  }

  @Bean
  CommandLineRunner demo(CustomerRepository repository) {
    return args -> {
      // Insertar datos
      repository.save(new Customer("Jack", "Bauer"));
      repository.save(new Customer("Chloe", "O'Brian"));
      repository.save(new Customer("Kim", "Bauer"));
      repository.save(new Customer("David", "Palmer"));
      repository.save(new Customer("Michelle", "Dessler"));

      log.info("Customers found with findAll():");
      repository.findAll().forEach(c -> log.info(c.toString()));


      Customer c1 = repository.findById(1L);
      log.info("Customer found with findById(1L): {}", c1);


      log.info("Customers found with findByLastName('Bauer'):");
      repository.findByLastName("Bauer").forEach(c -> log.info(c.toString()));
    };
  }
}
