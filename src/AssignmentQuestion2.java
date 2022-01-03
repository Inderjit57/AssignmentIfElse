
public class AssignmentQuestion2 {

	public static void main(String[] args) {
		int age = 23;
		String level1 = "g1";
		String level2 = "g2";
		String level3 = "g";

		int diff = 16 - age;

		boolean iflevel1 = false;
		boolean iflevel2 = true;
		boolean iflevel3 = true;
		boolean alllevel = (iflevel1 == iflevel2) && (iflevel1 == iflevel3) && (iflevel2 == iflevel3);

		if (age < 16) {
			System.out.print("minimum required age is 16, come back after: " + diff + "years");
		} else if (age >= 16 && iflevel1) {
			System.out.println("at level1: " + level1);
			System.out.println("eligible to get g2: " + level2);
		}

		else if (age >= 16 && iflevel2) {
			System.out.println("at level1: " + level2);
			System.out.println("eligible to get g: " + level3);
		}

		else if (iflevel3) {
			System.out.println("you have passed level3: " + level3);
		}

		else if (alllevel) {
			System.out.println("all level passed");
		}

	}

}
