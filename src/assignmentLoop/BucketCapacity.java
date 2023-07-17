package assignmentLoop;

public class BucketCapacity {
	int bucket;
	int waterTank;
	int initialLevel;
	int maxLevel;
	
	void fillTankByBucket() {
		int initialLevel =5; maxLevel =95;
		for (maxLevel = maxLevel - initialLevel; bucket <= maxLevel;  ) {
			System.out.println("The water is stopped from overflowing");
			break;
		}
		
	}
	
}

//	void fillTankByBucket() {
//		while (bucket <= 90) {
//			System.out.println("The water tank is filled upto " + bucket + "litres");
//			bucket += 10;
//
//			if (bucket == 100) {
//
//				System.out.println("The water is stopped from overflowing");
//				break;
//			}
//		}
//	}

