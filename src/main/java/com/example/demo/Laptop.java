package com.example.demo;

import org.springframework.stereotype.Component;

// making your class as component annotation, then spring knows that spring has to manage that particular obj
@Component

public class Laptop {

    public void compile(){
        System.out.println("compiling...");
    }
}
