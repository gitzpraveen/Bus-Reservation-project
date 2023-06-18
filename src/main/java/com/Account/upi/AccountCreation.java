package com.Account.upi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AccountCreation {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		                                           TABLE ENTRY
//		
//		Account account1=new Account();
//		account1.setName("Praveen");
//		account1.setAccno(987654321);
//		account1.setIfsc("ABC123");
//		account1.setBranch("kannamangalam");
//		account1.setAddress("tvmalai");
//		account1.setPin(1234);
//		account1.setBalance(25000);
//		
//		Account account2=new Account();
//		account2.setName("rahul");
//		account2.setAccno(887654329);
//		account2.setIfsc("BBC123");
//		account2.setBranch("Arani");
//		account2.setAddress("tvmalai");
//		account2.setPin(0123);
//		account2.setBalance(45000);
//		
//		Account account3=new Account();
//		account3.setName("ravi");
//		account3.setAccno(765444321);
//		account3.setIfsc("YOC123");
//		account3.setBranch("latheri");
//		account3.setAddress("vellore");
//		account3.setPin(9876);
//		account3.setBalance(75000);
//		
//		Account account4=new Account();
//		account4.setName("pooja");
//		account4.setAccno(674554321);
//		account4.setIfsc("HIK345");
//		account4.setBranch("vvpuram");
//		account4.setAddress("vellore");
//		account4.setPin(1234);
//		account4.setBalance(15000);
//		
//		Account account5=new Account();
//		account5.setName("raja");
//		account5.setAccno(768654321);
//		account5.setIfsc("ROT123");
//		account5.setBranch("annanagar");
//		account5.setAddress("chennai");
//		account5.setPin(7834);
//		account5.setBalance(25000);
//		
//		Account account6=new Account();
//		account6.setName("rani");
//		account6.setAccno(345654321);
//		account6.setIfsc("LOK123");
//		account6.setBranch("central");
//		account6.setAddress("chennai");
//		account6.setPin(8774);
//		account6.setBalance(45000);
//		
//		Account account7=new Account();
//		account7.setName("kingsley");
//		account7.setAccno(887654321);
//		account7.setIfsc("AKK123");
//		account7.setBranch("kulli");
//		account7.setAddress("delhi");
//		account7.setPin(1454);
//		account7.setBalance(35000);
//		
//		Account account8=new Account();
//		account8.setName("pattu");
//		account8.setAccno(887654390);
//		account8.setIfsc("DSC123");
//		account8.setBranch("guwathi");
//		account8.setAddress("delhi");
//		account8.setPin(1234);
//		account8.setBalance(25000);
//		
//		Account account9=new Account();
//		account9.setName("pavan");
//		account9.setAccno(237654321);
//		account9.setIfsc("VBS123");
//		account9.setBranch("kanni nagar");
//		account9.setAddress("karnataka");
//		account9.setPin(5634);
//		account9.setBalance(95000);
//		
//		Account account10=new Account();
//		account10.setName("arjun");
//		account10.setAccno(787677321);
//		account10.setIfsc("KBC123");
//		account10.setBranch("kelli anagar");
//		account10.setAddress("karnataka");
//		account10.setPin(3434);
//		account10.setBalance(25000);
//		
//		entityTransaction.begin();
//		entityManager.persist(account1);
//		entityManager.persist(account2);
//		entityManager.persist(account3);
//		entityManager.persist(account4);
//		entityManager.persist(account5);
//		entityManager.persist(account6);
//		entityManager.persist(account7);
//		entityManager.persist(account8);
//		entityManager.persist(account9);
//		entityManager.persist(account10);
//		
//		entityTransaction.commit();
		
		
//		                                  UPDATE
//		
//		Account account=entityManager.find(Account.class, 2);
//		account.setPin(4534);
//		entityTransaction.begin();
//		entityManager.merge(account);
//		entityTransaction.commit();
//		
	}

}
