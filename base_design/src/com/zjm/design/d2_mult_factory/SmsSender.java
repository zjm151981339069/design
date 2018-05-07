package com.zjm.design.d2_mult_factory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is sms sender");
		
	}

}
