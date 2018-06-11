package com.zjm.design.d18_Command;


public class MyCommand implements Command{
    
	private Receiver receiver;
	
	@Override
	public void exe() {
		receiver.action();
	}
	
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

}
