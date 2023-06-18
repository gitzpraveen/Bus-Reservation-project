package com.bus.ticket.exception;

public class InsufficientBalance extends RuntimeException{
	String messaage;

	public InsufficientBalance(String messaage) {
		super();
		this.messaage = messaage;
	}

	@Override
	public String toString() {
		return "InsufficientBalance [messaage=" + messaage + "]";
	}

}
