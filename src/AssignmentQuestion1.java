
public class AssignmentQuestion1 {

	public static void main(String[] args) {

		int score =100 ;
		char grade1 = 'A';
		char grade2 = 'B';
		char grade3 = 'C';
		char grade4 = 'D';
		
		// score is between 0-50
		if (score >= 0 && score <= 50) {
			System.out.print("The Student score is between 0-50%, So grade is: " + grade4);
		}

		// score is between 50-60
		else if (score > 50 && score <= 60) {
			System.out.print("The Student score is between 50-60%, So grade is: " + grade3);
		}

		// score is between 60-75
		else if (score > 60 && score < 75) {
			System.out.print("The Student score is between 60-75%, So grade is: " + grade2);
		}

		// score is above 75
		else if (score >= 75 && score < 100) {
			System.out.print("The Student scored above 75%, So grade is: " + grade1);
		}

		else {
			System.out.println("out of scope");
		}

	}

}
