package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// making your class as component annotation, then spring knows that spring has to manage that particular obj
@Component
public class Coding {
    // we need to made a connection between laptop and coding by using wiring --> AutoWired for setter function
    
    @Value("25")
    int age;
    Computer com;

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public Computer getCom() {
        return com;
    }

    @Autowired

    // Even though u r added primary annotation to Desktop class but in Qualifier u r giving laptop,so it will consider laptop only
   // we need to pass class name with small letter as starting for Qualifier annotation
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
       com.compile();
    }
}
