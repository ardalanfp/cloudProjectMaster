package com.microservice.FumElection;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasterApplication {
    public static void main(String[] args) {
        System.out.println("goiing to sleep!!!!!!!!");
		try{
			Thread.sleep(120000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("waking up!!!!!!!!!!!!!!");
        SpringApplication.run(MasterApplication.class, args);
    }
}
