package brandedProducts;

import java.util.Scanner;

import java.util.Arrays;

public class TopBrands {

	String[] samsung = new String[4];
	String[] google = new String[4];
	String[] apple = new String[4];
	String[] brandSelected = new String[4];
    String availableProducts;
	String enteredBrandName;
	boolean productIsPresent = false;

	void populateBrandProducts() {
		samsung[0] = "S20";
		samsung[1] = "S21";
		samsung[2] = "Flip3";
		samsung[3] = "Fold3";

		google[0] = "Google Pixel 6";
		google[1] = "Google Pixel 6 Pro";
		google[2] = "Google Pixel Pro";
		google[3] = "Google Pixel 5";

		apple[0] = "Iphone12";
		apple[1] = "Iphone12 mini";
		apple[2] = "Iphone 11";
		apple[3] = "Iphone 11";

		System.out.println("The different products available in Samsung are " + Arrays.toString(samsung));
		System.out.println("The different products available in Google are " + Arrays.toString(google));
		System.out.println("The different products available in Apple are " + Arrays.toString(apple));

	}

	void availableBrandProducts() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Brand Name from the following list");

		System.out.println("Samsung");
		System.out.println("Google");
		System.out.println("Apple");
		enteredBrandName = sc.next();

		System.out.println("Now please enter a product name from the " + enteredBrandName);

		

		switch (availableProducts) {

		case "samsung":
			
			for (int i = 0; i < samsung.length; i++) {
				availableProducts = sc.next();
				if (enteredBrandName.equalsIgnoreCase("samsung[i]")) {
					System.out.println("product selected is :" + availableProducts);
					productIsPresent = true;
				}
				if (productIsPresent = false) {
					System.out.println("Please select a product from the list");
				}
			break;
			}

		case "google":

			for (int i = 0; i < google.length; i++) {
				availableProducts = sc.next();
				if (availableProducts.equalsIgnoreCase("google[i]")) {
					System.out.println("product selected is :" + availableProducts);
					productIsPresent = true;
				}
				if (productIsPresent = false) {
					System.out.println("Please select a product from the list");
				}

			break;
			}

		case "apple":

			for (int i = 0; i < apple.length; i++) {
				availableProducts = sc.next();
				if (availableProducts.equalsIgnoreCase("apple[i]")) {
					System.out.println("product selected is :" + availableProducts);
					productIsPresent = true;
				}
				if (productIsPresent = false) {
					System.out.println("Please select a product from the list");
				}
				break;
			}

		default:
			System.out.println("Please select a product from the list");
		}

	}

}
