package com.bus.ticket;

import java.util.Scanner;

import com.Account.upi.Payment;
import com.bus.ticket.exception.InsufficientTicket;

public class BusTicket
{
	public static int ticket = 30;
	public static int ticketcost = 200;
	public static int totalcost;
	 
	static Scanner scanner=new Scanner(System.in);
	
	
	public static synchronized void bookticket(int count, String name) {
		if (ticket >= count) {
			ticket -= count;
		System.out.println(name +" as choosed :"+count+" " +(count==1?"ticket":"tickets"));
		totalcost=count*ticketcost;
		
		System.out.println("Enter 1 for Payment or 0 for exit");
		  int choice= scanner.nextInt();
	
		switch (choice) {
		case 0: {
			
			System.out.println("payment not happened ,you are exited");
			System.exit(0);
		}
		case 1: {
			Payment.payAmount( totalcost);
			break;
			
		}
		
		default:
			System.out.println("enter whether 1 or 0 ,its invalid choice");
			
		}
		
			
			
		} else {
			try {
				String msg = "insufficient ticket,better luck next time";

				throw new InsufficientTicket(msg);

			} catch (Exception e) {

			}

		}

	}
	
	public static void message()
	{
		System.out.println("ticket booking is succesfully done,Have a nice journey");
		System.out.println("******************");
	}

}
