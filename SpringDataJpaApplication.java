package com.app.spring;

import com.app.spring.model.Customers;
import com.app.spring.repo.CustomersRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
        
        @Bean
        public CommandLineRunner testCustomersRepository (CustomersRepository repo) {
            return a -> {
              List<Customers> list = repo.findAll();
                System.out.format(" %-15s %-40s %-30s %-20s \n", "Customer ID", "Company Name", 
                          "Contact Name", "City");
                System.out.println("========================================================="
                          + "==================================");
              list.forEach(c -> {
                System.out.format(" %-15s %-40s %-30s %-20s \n", 
                        c.getCustomerID(), c.getCompanyName(), 
                          c.getContactName(), c.getCity());
              });
            };
        }
}
