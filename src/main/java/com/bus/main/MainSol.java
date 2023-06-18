package com.bus.main;


import java.util.Scanner;


import com.bus.ticket.*;

public class MainSol 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the count");
		int count=scanner.nextInt();
		System.out.println("enter the name");
		String name=scanner.next();
		User u1=new User(count,name);
		u1.start();
	
		
		
	}

}
