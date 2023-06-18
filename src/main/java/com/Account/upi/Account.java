package com.Account.upi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private long accno;
	@Column(nullable = false)
	private String ifsc;
	@Column(nullable = false)
	private String branch;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private int pin;
	@Column(nullable = false)
	private double balance;
	

}
