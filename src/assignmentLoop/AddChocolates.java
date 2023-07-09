package assignmentLoop;

public class AddChocolates {
	
	int chocolate;
	int box;
	
	void addChocolateToBox() {
		while (chocolate <= box) {
			System.out.println("Adding the chocolates in box by " + chocolate + "chocos");
			chocolate += 5;

			if (chocolate == 67) {

				System.out.println("No more space in the box");
				break;
			}

		}

		
	}

}
