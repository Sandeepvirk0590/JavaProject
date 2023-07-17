package brandedProducts;

import java.util.Scanner;

import java.util.Arrays;

public class TopBrands {
	
	String[] Samsung = new String[4];
	String[] Google = new String[4];
	String[] Apple = new String[4];
	
	void populateBrandProducts() {
		Samsung[0] = "S20";
		Samsung[1] = "S21";
		Samsung[2] = "Flip3";
		Samsung[3] = "Fold3";
		
		Google [0] = "Google Pixel 6";
		Google [1] = "Google Pixel 6 Pro";
		Google [2] = "Google Pixel Pro";
		Google [3] = "Google Pixel 5";
		
		Apple [0] = "Iphone12";
		Apple [1] = "Iphone12 mini";
		Apple [2] = "Iphone 11";
		Apple [3] = "Iphone 11";
		
		System.out.println("The different products available in Samsung are " +Arrays.toString(Samsung));
		System.out.println("The different products available in Google are " +Arrays.toString(Google));
		System.out.println("The different products available in Apple are " +Arrays.toString(Apple));

	}

	void availableBrandProducts() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the product Name");
		
	        for (int i=0; i<Samsung.length; i++)
	        for (int j=0; j<Google.length; j++)
	        for (int n=0; n<Apple.length; n++){
	        
		        String enteredName = sc.next();

			if (enteredName.equals("Samsung")) {
				System.out.println("product selected is :" +enteredName);
			}
	        

			else if (enteredName.equals("Google")){
				System.out.println("product selected is :" +enteredName);
			}
		

			else if (enteredName.equals("Apple")){
				System.out.println("product selected is :" +enteredName);
			}
			
			else {
				System.out.println("Please select a product from the list");
			}		
    }	
	}
}
