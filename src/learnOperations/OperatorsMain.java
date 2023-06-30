package learnOperations;

public class OperatorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperations ao = new ArithmeticOperations();
		
	    //Assigning the values
		ao.num1 = 8;
		ao.num2 = 10;
	
		//Invoking the method
		ao.addTwoNumbers();
		
		ao.subtractTwoNumbers();
		
		System.out.println("---------Reassigning the values---------");
		
		//Reassigning the values/ Updating the values
		ao.num1 = 15;
		ao.num2 = 6;

		
		ao.multiplyTwoNumbers();
		
		ArithmeticOperations ao1 = new ArithmeticOperations();
		
		ao1.num1 = 45;
		ao1.num2 = 10;
		ao1.divideTwoNumbers();
		
		
		AssignmentOperators ao2 = new AssignmentOperators();
	
		ao2.ageAfter5Years();
		ao2.ageBefore10Years();
		ao2.premiumReduce();
		ao2.benefitReceive();
		
	}

}
