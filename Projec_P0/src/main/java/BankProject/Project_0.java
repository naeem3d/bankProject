package BankProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Project_0 {
	public static Map<String,String> users = new HashMap<String,String>();
	static  Scanner scanner = new Scanner(System.in);
	private static  Account account = new Account("defalult", 0, "defalult", "defalult","default","default");
	
	public static void main(String[] BankProject) {
	
		
		
		printInstructions();
		String filename3 = "./paswordexample.txt";
		
	
	boolean quit = false;
	int choice = 0;
	System.out.println("Enter your choice: ");
	while(!quit) {
		
         choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
             case 0:
            	 Register();
                 break;
             case 1:
            	 Login();
                 break;
             case 2:
            	 System.out.println("You are Exit ");
                     quit = true;
                     break;
         }
         wirteCharacter(filename3);
	}
	
	 readCharacter(filename3);
	
}



public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - Register for New Account.");
    System.out.println("\t 1 - Login  your Account.");
    System.out.println("\t 2 - Exit.");
    
}


public static void Register() {

	
	 System.out.println("Your Account is :" + account.getNumber() +"\n");
	 System.out.println("Please Enter Your Name:" +"\n");
	 String name =scanner.nextLine();
	 account.setName(name);
	
	 
	 System.out.println("Please Enter Your PhoneNumber:" +"\n");
	 String PhoneNumber =scanner.nextLine();
	 account.setPhoneNumber(PhoneNumber);
	 
	 
	 System.out.println("Please Enter Your EmailAddress:" +"\n");
	 String Email =scanner.nextLine();
	 account.setEmailAddress(Email);
	
	 
	 System.out.println("Please Enter Your Deposit Ammmount :" +"\n");
	 
	 double deposit =  scanner.nextDouble();
	 scanner.nextLine();
	 account.deposit(deposit);
	
	 
	 System.out.println("Please Enter Your User Name :" +"\n");
	 String username =scanner.nextLine();
	 account.setUserName(username);
	String username1 = account.getUserName();
	 
	 System.out.println("Please Enter Your Password :" +"\n");
	 String password =scanner.nextLine();
	 account.setPassword(password);
	 String password1 = account.getPassword();
	
	 users.put(username1, password1);

	
	
	 System.out.println("Your Account Info is : " + "\n" +   "Name is : " + account.getName() +  "\n" +"AccountNumberis : "+ account.getNumber() +"\n" + "your PhoneNumber is : " + account.getPhoneNumber()+  "\n" +  "your email is : " + account.getEmailAddress()+ "\n" +"Balnce is : " + account.getBalance()  + "\n"  );
}

public static void Login() {
	
	 System.out.println("Please Enter Your username :" +"\n");
	 String username =scanner.nextLine();
	 System.out.println("Please Enter Your password :" +"\n");
	 String password =scanner.nextLine();
	Customers customer = new Customers(username, password);
	Customers.checkUserNameandPassword(users, username, password);

	 System.out.println("Login your choice: "+customer.getUsername() + 	customer.getPassword());
	
}

public static void wirteCharacter(String filename) {
	 try {
		 
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		
		writer.write("Hi naeem good luck \n");
		writer.write( "Your Account Info is : " + "\n" +   "Name is : " + account.getName() +  "\n" +"AccountNumberis : "+ account.getNumber() +"\n" + "your PhoneNumber is : " + account.getPhoneNumber()+  "\n" +  "your email is : " + account.getEmailAddress()+ "\n" +"Balnce is : " + account.getBalance()  + "\n" );
		writer.close();
	 }catch (Exception e){
		 e.printStackTrace();
	 }
	 
}

public static void readCharacter(String filename) {
	 try {
		 
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line = "";
		while ((line = reader.readLine())!= null) {
			System.out.println(line);
		}
		reader.close();
		
		
	 }catch (Exception e){
		 e.printStackTrace();
	 }
	 
}



}
