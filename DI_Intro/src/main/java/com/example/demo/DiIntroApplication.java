package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class DiIntroApplication {

	
	@Autowired
	private Notification notify;
	
	public static void main(String[] args) {
	SpringApplication.run(DiIntroApplication.class, args);
	
	
		
		
	}
	
	@PostConstruct
	public void execute() {
		
		notify.showmsg();
	}

}
