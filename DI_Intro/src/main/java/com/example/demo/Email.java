package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Email  implements Message{


	public void sendmsg() {
		
			System.out.println("This is an EMAIL msg");
		}
		
	}


