package com.zjm.design.d18_Command;

public class Invoker {
	private Command command;

	public Invoker(Command cmd) {
		this.command = command;
	}

	public void action() {
		command.exe();
	}
}
