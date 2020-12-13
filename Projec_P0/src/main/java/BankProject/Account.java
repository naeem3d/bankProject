package BankProject;

import java.util.Random;

public class Account {
	private int number;
	private String name ;
	private double balance ;
	private String EmailAddress;
	private String PhoneNumber;
	private String userName ;
	private String password;
	
	
	public Account( String name, double balance, String emailAddress, String phoneNumber , String username ,String password ) {
		super();
		Random rand = new Random() ; 
		int number1 = rand.nextInt(999999999) ;
		
		
		this.number = number1;		
		this.name = name;
		this.balance = balance;
		this.EmailAddress = emailAddress;
		this.PhoneNumber = phoneNumber;
		this.userName = username ;
		this.password = password ;
	}
	
	
	
	
	public void deposit (double depositAmount) {
		this.balance += depositAmount ;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(balance - withdrawalAmount <0 ) {
			System.out.println("only " + balance + "just the amount you have ") ;
		}else {
			balance -= withdrawalAmount ;
		}
	}
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getNumber() {
		return number;
	}

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}



	
	

}
