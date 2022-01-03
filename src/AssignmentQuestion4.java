
public class AssignmentQuestion4 {

	public static void main(String[] args) {

		int num1 = 207;
		int num2 = 40;
		int sum = num1 % num2;
		boolean ifmultiple = num1 % num2 == 0;

		if (ifmultiple) {
			System.out.print("num1 is a multiple of num2:" + " " + ifmultiple + "\nRemainder is: " + sum);
		}

		else {
			System.out.println("num1 is not a multiple of num2" + "\nRemainder is: " + sum);
		}

	}

}
