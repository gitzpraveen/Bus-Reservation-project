package com.bus.ticket;

public class User extends Thread
{
	int count;
	String name;
	
	
	public User(int count, String name) {
		super();
		this.count = count;
		this.name = name;
	}


	public void run()
	{
		
		
		BusTicket.bookticket(count, name);
		
		
	}


}
