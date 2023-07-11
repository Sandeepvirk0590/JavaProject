package assignmentLoop;

import java.util.Scanner;

public class LoginApplication {

	String username;
	String password;
	int attempts;

	Scanner sc = new Scanner(System.in);

	void loginTheAccount() {

		attempts = 1;

		while (attempts < 4) {
			System.out.println("Attempt to login" + attempts);

			System.out.println("Enter Username");
			username = sc.next();

			System.out.println("Enter Password");
			password = sc.next();

			if (username.equalsIgnoreCase("pivotAdmin") && (password.equalsIgnoreCase("Admin123"))) {
				System.out.println("You are logged in to the application");
				break;
			} else {
				attempts++;

				if (attempts == 4) {
					System.out.println("Account locked");
					break;
				}
				System.out.println("Incorrect User id or password. Try again");
			}
		}

	}

}
