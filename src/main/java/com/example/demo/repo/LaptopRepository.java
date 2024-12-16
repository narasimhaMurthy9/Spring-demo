package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Laptop;

// in repository we probably do saving data in Db, we will connect DB from this file...

@Repository
public class LaptopRepository {

     public void save(Laptop lap){
         // we need to write jdbc  steps here and we have all the crud operatons here
         System.out.println("saved in DB from repository");
     }
}
