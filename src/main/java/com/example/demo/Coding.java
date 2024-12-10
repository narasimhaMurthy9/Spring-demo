package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// making your class as component annotation, then spring knows that spring has to manage that particular obj
@Component
public class Coding {
    // we need to made a connection between laptop and coding by using wiring --> AutoWired
    @Autowired
    Laptop laptop;
    public void code(){
       laptop.compile();
    }
}
