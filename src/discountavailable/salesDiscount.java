package discountavailable;

import java.util.Scanner;

public class salesDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a instance of a class

		SpecialDiscount offer = new SpecialDiscount();
		
		//Adding a Scanner

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the price of the product =");
		
		//invoking the method:

		offer.price = sc.nextDouble();
		
		

		System.out.println("Enter the promoCode =");

		offer.promoCode = sc.next();

		offer.currentSales();

	}

}
