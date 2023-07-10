package assignmentLoop;

import java.util.Scanner;

public class LoginApplication {

	String username;
	String password;
	int attempts;
	int maxAttempts;

	void loginTheAccount() {

		if (username.equalsIgnoreCase("pivotAdmin") && (password.equalsIgnoreCase("Admin123"))) {

			System.out.println("You are logged in to the application");

		}
		else {
		System.out.println("Incorrect User id or password. Try again");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username again");
		username = sc.next();

		System.out.println("Enter Password again");
		password = sc.next();

		while (attempts >= maxAttempts) {

			attempts += 1;

			if (attempts == 4) {
				System.out.println("Account locked");
				break;
			}
		}
		}
		
	}
	

	}
	
