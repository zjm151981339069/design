package com.zjm.design.d2_mult_factory;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail sender");
		
	}

}
