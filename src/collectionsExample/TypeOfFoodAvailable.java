package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfFoodAvailable {

	public void availableFood() {

		ArrayList<Restaurant> vegfood = new ArrayList<>();
		vegfood.add(new Restaurant("Cheese Pasta", 30));
		vegfood.add(new Restaurant("Grilled Sandwich", 50));
		vegfood.add(new Restaurant("Burgers", 20));
		vegfood.add(new Restaurant("Veg CrunchWrap", 10));
		vegfood.add(new Restaurant("Burrito", 40));

		ArrayList<Restaurant> nonVegfood = new ArrayList<>();
		nonVegfood.add(new Restaurant("Salmon", 50));
		nonVegfood.add(new Restaurant("Mutton", 60));
		nonVegfood.add(new Restaurant("BbQ Chicken", 20));
		nonVegfood.add(new Restaurant("Tuna Sushi", 70));
		nonVegfood.add(new Restaurant("Beef Rice Bowl", 80));

		HashMap<String, ArrayList<Restaurant>> foodType = new HashMap<>();

		foodType.put("Non-Veg", nonVegfood);
		foodType.put("Veg", vegfood);

		System.out.println("What kind of food you prefer: (Non-Veg or Veg)");
		Scanner sc = new Scanner(System.in);
		String menuSelection = sc.nextLine();

		ArrayList<Restaurant> menu = foodType.get(menuSelection);
		if (!(menu == null)) {
			System.out.println("You have following options in the " + menuSelection + " food:");
			for (Restaurant food : menu) {
				System.out.println(food.nameOfFood + " $" + food.price);
			}
		} else {
			System.out.println("Selection is not valid");
		}

	}
}
