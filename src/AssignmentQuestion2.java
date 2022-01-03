
public class AssignmentQuestion2 {

	public static void main(String[] args) {
		int age = 13; // Change the date as Required. Minimum Driver's license age is 16 in Ontario.
		String level1 = "G1";
		String level2 = "G2";
		String level3 = "G";

		int diff = 16 - age;

		// Change the Boolean value to True or False as per levels. Only one boolean can
		// be true at one time.
		boolean iflevel1 = false;
		boolean iflevel2 = false;
		boolean iflevel3 = true;

		// Minimum Driver's license age is 16 in Ontario.
		if (age < 16) {
			System.out.print("Minimum required age is 16, come back after: " + diff + "years");
		}
		
		//Boolean ifLevel1
		else if (age >= 16 && iflevel1) {
			System.out.println("At level1: " + level1);
			System.out.println("Eligible to get g2: " + level2);
		}

		//Boolean ifLevel2
		else if (age >= 16 && iflevel2) {
			System.out.println("At level1: " + level2);
			System.out.println("Eligible to get g: " + level3);
		}
		
		//Boolean ifLevel3
		else if (iflevel3) {
			System.out.println("You have passed level3: " + level3);
		}
		else
		{
			System.out.println("none");
		}
	}

}
