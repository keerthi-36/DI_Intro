package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notification {
	
	@Autowired
	private Message message;

	
	@Autowired
	@Qualifier("sms")
	private Message message1;
	
	
	public void showmsg() {
		message.sendmsg();
		message1.sendmsg();
	}
}
