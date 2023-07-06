package firstPackage;

public class MobileMain {
	
	//Instantiating a class
	//Class is a blue print or template
	//RightClick->Re-factor->Rename
	public static void main (String [] args) {
		MobilePhone iPhone = new MobilePhone();
		
		//Adding a comment
		//Assigning values to the variables
		iPhone.brandName = "IPhone";
		iPhone.modelNumber="12";
		iPhone.screenSizeInInches = 6.1;
		iPhone.isCameraPresent = true;
		
		//Calling the method or Invoking the method
		iPhone.makeCalls();
		iPhone.sendTextMessage();

		
		
		//Instantiating a class
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelNumber = "S22";
		samsung.screenSizeInInches = 6.2;
		samsung.isCameraPresent = true;
		
		
	}

}
