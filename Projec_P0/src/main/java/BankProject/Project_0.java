package BankProject;

import java.util.Scanner;

public class Project_0 {
	static  Scanner scanner = new Scanner(System.in);
	public static void main(String[] BankProject) {
	
	
	printInstructions();
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
		
	}
	
	
	
}



public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - Register for New Account.");
    System.out.println("\t 1 - Login  your Account.");
    System.out.println("\t 2 - Exit.");
    
}


public static void Register() {
	 Account account = new Account("defalult", 0, "defalult", "defalult");
	boolean quit = false;
	
	
	 System.out.println("Your Account is :" + account.getNumber() +"\n");
	 System.out.println("Please Enter Your Name:" +"\n");
	 String name =scanner.nextLine();
	 account.setName(name);
	 System.out.println( account.getName());
	 
	 System.out.println("Please Enter Your PhoneNumber:" +"\n");
	 String PhoneNumber =scanner.nextLine();
	 account.setPhoneNumber(PhoneNumber);
	 System.out.println( account.getPhoneNumber());
	 
	 System.out.println("Please Enter Your EmailAddress:" +"\n");
	 String Email =scanner.nextLine();
	 account.setEmailAddress(Email);
	 System.out.println( account.getEmailAddress());
	 
	 System.out.println("Please Enter Your Balunce:" +"\n");
	 double deposit =  scanner.nextDouble();
	 double balance = account.getBalance() + deposit ;
	 account.setBalance(balance);
	 System.out.println(account.getBalance());
	 
	 
	
	
	 System.out.println("Your Account Info is : " + "\n" +   "Name is : " + account.getName() +  "\n" +"AccountNumberis : "+ account.getNumber() +"\n" + "your PhoneNumber is : " + account.getPhoneNumber()+  "\n" +  "your email is : " + account.getEmailAddress()+ "\n" +"Balnce is : " + account.getBalance()  );
}

public static void Login() {
	 System.out.println("Login your choice: ");
}




}
