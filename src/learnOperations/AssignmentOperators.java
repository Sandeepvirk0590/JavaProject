package learnOperations;

public class AssignmentOperators {
	
	int age = 25;
	
	void ageAfter5Years() {
		age +=5;
		System.out.println("Age after 5 Years = "+age);
	}
	
	void ageBefore10Years() {
		age -=10;
		System.out.println("Age before 10 Years = "+age);
		
	}
	
	//assigned another variable
	int age2 = 30;
	
	void premiumReduce() {
		age2 *=2;
		System.out.println("The insurance premium reduce after age = "+age2);
		
	}
	
	
	void benefitReceive() {
		age %= 300000;
		System.out.println("The benefit received at the age of 65 = "+age);
	}
	

}
