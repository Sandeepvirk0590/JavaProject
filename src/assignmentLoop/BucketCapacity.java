package assignmentLoop;

public class BucketCapacity {
	int bucket;
	int waterTank;

	void fillTankByBucket() {
		while (bucket <= waterTank) {
			System.out.println("The water tank is filled upto " + bucket + "litres");
			bucket += 10;

			if (bucket == 110) {

				System.out.println("The water is stopped from overflowing");
				break;
			}

		}

	}
}
