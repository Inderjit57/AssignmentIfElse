
public class AssignmentQuestion7 {

	public static void main(String[] args) {

		// Criteria : Height<90 cm and more than 200 cm is not allowed.

		int height = 89;

		if (height >= 90 && height <= 200) {
			System.out.println("You are good to take a Ride. JumpON!" + "\nYour height is: " + height);
		}

		else {
			System.out.println("Do some exercise and then try");
		}
	}

}
