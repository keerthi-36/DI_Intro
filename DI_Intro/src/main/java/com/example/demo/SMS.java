package com.example.demo;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMS  implements Message{

	
	public void sendmsg() {
		// TODO Auto-generated method stub
		System.out.println("this is an SMS ");
		
	}

}
