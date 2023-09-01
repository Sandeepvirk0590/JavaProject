package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapList {

	public static void printList() {

		ArrayList<String> listOfNames = new ArrayList<>();

		listOfNames.add(0, "Sandeep Kaur");
		listOfNames.add(1, "Manpreet Kaur");
		listOfNames.add(2, "Rajdeep Kaur");
		listOfNames.add(3, "Blessy");

		HashMap<Integer, ArrayList<String>> names = new HashMap<>();

		for (Entry<Integer, ArrayList<String>> entry : names.entrySet()) {
			if (entry.getKey().equals(1)) {
				ArrayList<String> val = entry.getValue();
				for (String girls : val) {
					System.out.println(girls);
				}
			}

		}
	}
}
