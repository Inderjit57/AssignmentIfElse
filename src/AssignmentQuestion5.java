
public class AssignmentQuestion5 {

	public static void main(String[] args) {

		int goalsAchieved = 25; // No. of goals achieved
		double goal50 = 0.01; // 1% of commision for 50% goals
		double goalLess70 = 0.05; // 5%of commision for less than 70% goals achieved
		double goalMore70 = 0.1; // 10% of commision for more than 70% goals achieved

		// Commison formula based on goals
		double commision50 = (goalsAchieved + (goalsAchieved * goal50));
		double commision70 = (goalsAchieved + (goalsAchieved * goalLess70));
		double commision70Plus = (goalsAchieved + (goalsAchieved * goalMore70));

		if (goalsAchieved <= 50) {
			System.out.println("Total goals achieved: " + goalsAchieved + "\nCommision will be: " + commision50);
		}

		else if (goalsAchieved <= 70) {
			System.out.println("Total goals achieved: " + goalsAchieved + "\nCommision will be: " + commision70);
		}

		else if (goalsAchieved > 70) {
			System.out.println("Total goals achieved: " + goalsAchieved + "\nCommision will be: " + commision70Plus);
		}

	}

}
