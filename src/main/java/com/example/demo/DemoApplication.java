package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Coding;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// now i dont want to create obj or bean  by writing syntax like obj = new Coding(); i want spring need to create obj or bean
		// here in spring the ApplicationContext will do that, ApplicationContext will be returned from SpringApplication.run
		// Coding obj = context.getBean(Coding.class);
		// System.out.println(obj.getAge());
		// obj.code();

         
	    LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		// let say i want to store some data in laptop lets's say lap, now we can simply use a class service
		service.addLaptop(lap);
	}

}
