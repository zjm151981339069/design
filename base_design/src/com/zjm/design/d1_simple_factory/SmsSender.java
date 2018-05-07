package com.zjm.design.d1_simple_factory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is sms sender");
		
	}

}
