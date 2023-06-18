package com.Account.upi;

import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Query;

import com.bus.ticket.BusTicket;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Payment 
{
	public static void payAmount(int totalcost)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the pin");
		int pin=scanner.nextInt();
		System.out.println("enter the name ");
		String name=scanner.nextLine();
           //int id=scanner.nextInt();
		Account account=entityManager.find(Account.class, name);
		int dbpin=account.getPin();
		




		if(pin==dbpin )
		{
			account.setBalance(account.getBalance()-totalcost);
			
			entityTransaction.begin();
			entityManager.merge(account);
			entityTransaction.commit();
			BusTicket.message();

		}
		else
		{
			System.err.println("invalid pin and name");
		}
		
	}

}
