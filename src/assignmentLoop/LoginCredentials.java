package assignmentLoop;

import java.util.Scanner;

public class LoginCredentials {

	public static void main(String[] args) {
		
		LoginApplication info = new LoginApplication();
		
		info.attempts = 1;
		info.maxAttempts = 3;
	
		
		Scanner sc = new Scanner(System.in);
        
		
		System.out.println("Enter Username");
		
		info.username = sc.next();
		
		
	    System.out.println("Enter Password");
	    
	    info.password = sc.next();
  
		
	    info.loginTheAccount();
	}

}
