
public class AssignmentQuestion3 {

	public static void main(String[] args) {

		// Q3. Find the largest of 3 given numbers. Using && operator
		int num1 = 1000;
		int num2 = 610;
		int num3 = 10000;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is greater than num2 and num3:" + num1);
		}

		else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is greater than num1 and num3:" + num2);
		} else {
			System.out.println("num3 is greater than num1 and num2:" + num3);
		}
	}

}
