package discountavailable;

public class SpecialDiscount {

	double price;
	double discount;
	String promoCode;
	double finalPrice;

	void currentSales() {
        // Adding a comment
		discount = price * 50 / 100;

		System.out.println("The price after 50% sales on the product is" + discount);

		if (promoCode.equalsIgnoreCase("promo5")) {
			finalPrice = (discount - (discount * 0.05));
			System.out.println("The price after promos applied is " + finalPrice);

		}

		else if (promoCode.equalsIgnoreCase("promo10")) {

			finalPrice = (discount - (discount * 0.10));
			System.out.println("The price of this product is " + finalPrice);
		}

		else if (promoCode.equalsIgnoreCase("promo20")) {

			finalPrice = (discount - (discount * 0.20));
			System.out.println("The price of this product is " + finalPrice);
		}

		else {
			System.out.println("No promos, The final price is " + discount);
		}
	}
}
