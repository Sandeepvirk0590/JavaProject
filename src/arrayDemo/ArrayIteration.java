package arrayDemo;

import java.util.Scanner;

public class ArrayIteration {

	//int[] numArray = { 1, 2, 3, 4, 5 };

	String[] names = new String[5];
	

	Scanner sc = new Scanner(System.in);


    //Print each element in an array

	//void printNumArray() {
	//	for (int i = 0; i < numArray.length; i++) {
	//		System.out.println("Element at index " + i + " :" + numArray[i]);
	//	}
	//}

	void populateNameArray() {

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name: " + (i + 1));
			names[i] = sc.next();
		}
	}

//	void printNames() {
//  
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
//	}
//Find the entered name if present in the array
	void findNameInArray() {
		String enteredName;

		
		for (int i = 0; i < names.length; i++) 
			System.out.println(names[i]);
		
		System.out.println("Now Enter the name you want to search" );
		enteredName = sc.next();{
	    if (enteredName.contains("names")) {
	    	System.out.println("The name is present in the list");
	    }
	 
	    else {
	    	System.out.println("Name is not present in the list");
	    }
			}
}
		
}

