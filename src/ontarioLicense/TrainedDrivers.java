package ontarioLicense;

import java.util.Scanner;

public class TrainedDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewLearners eligible = new NewLearners();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age of the person =");

		eligible.age = sc.nextInt();

		

		System.out.println("Enter the level of the licence =");

		eligible.currentlevel = sc.next();

		eligible.eligibleLearner();

	}

}
