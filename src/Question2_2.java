
public class Question2_2 {

	public static void main(String[] args) {
		/*
		 * Q2. Ontario license authority checks for two things to issue a license, 
		 * first is the age of person and the current level of license the person is holding(G1 or G2 or G). 
		 * Assume different values for these two values and write code which will print, 
		 * whether license will be used to the person or not and if the license is issued, 
		 * which type of license the person will get i.e. he will get a G1 or G2 or G.
		 */
		String level = "G2";
		int age = 16;

		if (age >= 16) {
			if (level == "G1") {
				System.out.println("you have G1 and eligible for G2");
			} else if (level == "G2") {
				System.out.println("you have G2 and eligible for G");
			} else {
				System.out.println("you have G now");
			}
		} else {
			System.out.println("you are not eligible");
		}
	}

}
