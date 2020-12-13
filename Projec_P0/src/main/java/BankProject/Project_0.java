package BankProject;

import java.io.FileWriter;
import java.util.Scanner;

public class Project_0 {
	
	static  Scanner scanner = new Scanner(System.in);
	private static  Account account = new Account("defalult", 0, "defalult", "defalult","default","default");
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
	String filename3 = "./paswordexample.txt";
	 wirteCharacter(filename3);
	
	
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
	 System.out.println( account.getName());
	 
	 System.out.println("Please Enter Your PhoneNumber:" +"\n");
	 String PhoneNumber =scanner.nextLine();
	 account.setPhoneNumber(PhoneNumber);
	 System.out.println( account.getPhoneNumber());
	 
	 System.out.println("Please Enter Your EmailAddress:" +"\n");
	 String Email =scanner.nextLine();
	 account.setEmailAddress(Email);
	 System.out.println( account.getEmailAddress());
	 
	 System.out.println("Please Enter Your Deposit Ammmount :" +"\n");
	 double deposit =  scanner.nextDouble();
	 account.deposit(deposit);
	 System.out.println(account.getBalance());
	 
	 System.out.println("Please Enter Your User Name :" +"\n");
	 String username =scanner.nextLine();
	 account.setUserName(username);
	 System.out.println( account.getUserName());
	 
	 System.out.println("Please Enter Your Password :" +"\n");
	 String password =scanner.nextLine();
	 account.setPassword(password);
	 System.out.println( account.getPassword());
	 

	
	
	 System.out.println("Your Account Info is : " + "\n" +   "Name is : " + account.getName() +  "\n" +"AccountNumberis : "+ account.getNumber() +"\n" + "your PhoneNumber is : " + account.getPhoneNumber()+  "\n" +  "your email is : " + account.getEmailAddress()+ "\n" +"Balnce is : " + account.getBalance()  + "\n"  );
}

public static void Login() {
	 System.out.println("Login your choice: ");
}

public static void wirteCharacter(String filename) {
	 try {
		 
		FileWriter writer = new FileWriter(filename ,true );
		writer.write(account.getNumber());
		writer.write( account.getName());
		writer.close();
	 }catch (Exception e){
		 e.printStackTrace();
	 }
	 
}


}
