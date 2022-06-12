package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@RequestMapping("/home")
	public String home() {
		String msg="Welcome to SBI Bank";
		return msg;
	}
	
	
	@RequestMapping("/balance")
	public String checkBalance() {
		String msg="Your current balance is: 76767868rs";
		return msg;
	}
	@RequestMapping("/statement")
	public String getStatement() {
		String msg="sent to your registred mail id";
		return msg;
	}
	@RequestMapping("/loan")
	public String getLoan() {
		String msg="You are eligible for taking loan of rs 1867826";
		return msg;
	}
	
	@RequestMapping("/contact")
	public String contact() {
		String msg="You can reach us on 9359275741";
		return msg;
	}

}
