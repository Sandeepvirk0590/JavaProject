package assignmentLoop;

public class AddChocolates {

	int chocolate;
	int totalCapacityOfBox;

	void addChocolateToBox() {
		System.out.println("Current number of chocolates in the box are" + chocolate);
		while (chocolate < 63) {

			chocolate += 5;
			System.out.println("Adding the chocolates in box by " + chocolate + "chocos");
			if (chocolate == 62) {

				System.out.println("No more space in the box");
				break;
			}

		}

	}

}
