package assignmentLoop;

public class BucketCapacity {
	int bucket;
	int waterTank;

	void fillTankByBucket() {
		while (bucket <= 90) {
			System.out.println("The water tank is filled upto " + bucket + "litres");
			bucket += 10;

			if (bucket == 100) {

				System.out.println("The water is stopped from overflowing");
				break;
			}

		}

	}
}
