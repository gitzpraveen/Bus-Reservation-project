package com.bus.ticket.exception;

public class InsufficientTicket extends Exception 
{
	String message;

	public InsufficientTicket(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InsufficientTicket [message=" + message + "]";
	}
	
	

}
