package loopsExample;

public class LoopsMain {

	public static void main(String[] args) {
	

		PrintSuccessiveNumbers loop = new PrintSuccessiveNumbers();
		loop.number = 1;
//		loop.finalNumber = 5;
//		loop.printSuccessiveNumbers();

		PrintSuccessiveNumbers printNumber = new PrintSuccessiveNumbers();
		printNumber.number = 10;
		printNumber.finalNumber = 15;
//		printNumber.printSuccssvNumbers();
//		printNumber.printNumbersInReverse();
		printNumber.printNumbersStopAt13();

	}

}
