package BankProject;


import java.util.HashMap;
import java.util.Map;

public class Customers {
	private String username ;
	private String password;
	private final Map<String,String> login ;
	public Customers(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.login = new HashMap<String,String>();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, String> getLogin() {
		return new HashMap<String,String>(login);
	}
	public static void checkUserNameandPassword(Map<String,String> list,String username,String password ) {
		if(list.containsKey(username)) {
			
			if (list.get(username).equals(password)) {
				System.out.println("hello");
			}else {
				System.out.println("incorrect password ");
			}
		}else {
			System.out.println(" User name not found ");
		}
		
		
		
	}
	

	
	
	
	
	
}
