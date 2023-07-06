package discountavailable;

import java.util.Scanner;

public class salesDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecialDiscount offer = new SpecialDiscount();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the price of the product =");

		offer.price = sc.nextDouble();
		
		

		System.out.println("Enter the promoCode =");

		offer.promoCode = sc.next();

		offer.currentSales();

	}

}
