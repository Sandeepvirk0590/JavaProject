package ontarioLicense;

public class NewLearners {

	int age;
	String currentlevel;

	void eligibleLearner() {

		if (age >= 16 && currentlevel.equalsIgnoreCase("-")) {

			System.out.println("The age is valid and eligible to apply for G1");
		}

		else if (age >= 16 && currentlevel.equalsIgnoreCase("G1")) {

			System.out.println("The current level is G1, so eligible to apply for G2");
		}

		else if (currentlevel.equalsIgnoreCase("G2")) {
			System.out.println("The current level is G2 and eligible to apply for G");
		}

		else {
			System.out.println("The age is not valid to apply for licence");
		}

	}
}
