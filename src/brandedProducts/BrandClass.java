package brandedProducts;

import java.util.Scanner;

public class BrandClass {

	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] apple = { "phone12", "Iphone12 mini", "Iphone 11", "Iphone 11" };
	String enteredBrandName;
	String enteredProductName;
	int i;
	boolean productIsPresent = false;

	Scanner sc = new Scanner(System.in);

	void selectProductFromBrand() {
		System.out.println("You need to select a brand");
		enteredBrandName = sc.next();{

		if (enteredBrandName.equalsIgnoreCase("samsung")) {
			System.out.println("The available products in Samsung are");
			for (i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}

			System.out.println("Now select a product from above list");
			enteredProductName = sc.next();

			if (enteredProductName.equalsIgnoreCase("samsung[i]")) {
				productIsPresent = true;
				System.out.println("The product is present" + enteredProductName);
			}

		}

		else if (enteredBrandName.equalsIgnoreCase("google")) {
			System.out.println("The available products in Google are");
			for (i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
			System.out.println("Now select a product from above list");
			enteredProductName = sc.next();

			if (enteredProductName.equalsIgnoreCase("google[i]")) {
				productIsPresent = true;
				System.out.println("The product is present" + enteredProductName);
			}
		}

		else if (enteredBrandName.equalsIgnoreCase("apple")) {
			System.out.println("The available products in Apple are");
			for (i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);
			}

			System.out.println("Now select a product from above list");
			enteredProductName = sc.next();

			if (enteredProductName.equalsIgnoreCase("apple[i]")) {
				productIsPresent = true;
				System.out.println("The product is present" + enteredProductName);
			}
		} else {
			System.out.println("Please select a product from the list");
		}
	
	
	System.out.println("This Brand is not available");
	}
	}
}
