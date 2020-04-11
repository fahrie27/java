/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.spring;

import com.app.UTS.inventory;
import com.app.spring.model.Customers;
import com.app.spring.repo.CustomersRepository;
import com.app.spring.repo.inventoryRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Fahrie
 */
@SpringBootApplication
public class springdatajpainventory {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    
     @Bean
        public CommandLineRunner testinventoryRepository (inventoryRepository repo) {
            return a -> {
              List<inventory> list = repo.findAll();
                System.out.format(" %-15s %-40s %-30s %-20s \n", "id_barang", "nama_barang", 
                          "jenis_barang", "harga", "jumlah");
                System.out.println("========================================================="
                          + "==================================");
              list.forEach(c -> {
                System.out.format(" %-15s %-40s %-30s %-20s \n", 
                        c.getId_barang(), c.getNama_barang(), 
                        c.getJenis_barang(), c.getHarga(),
                        c.getJumlah());
              });
            };
        }
}
