package firstPackage;

public class MobilePhone {
	
	String brandName;
	String modelNumber;
	double screenSizeInInches;
	int storageCapacity;
	String operatingSystem;
	boolean isCameraPresent;
	
	void makeCalls() {
		//double quotes
		System.out.println("Making calls from "+brandName+modelNumber);
	}
	
	void sendTextMessage() {
		System.out.println("Sending Text Messages");
	}
	


	
}
