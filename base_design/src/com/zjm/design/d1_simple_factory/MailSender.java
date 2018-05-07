package com.zjm.design.d1_simple_factory;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail sender");
		
	}

}
