
public class AssignmentQuestion3_2 {

	public static void main(String[] args) {
		// Q3. Find the largest of 3 given numbers. Using nested IF operator
		int num1 =100;
		int num2 =10;
		int num3=1000;
		
		if(num1>num2) {
			
			if(num1>num3) {
				System.out.println("num1 is the largest " + num1);
			}else {
				System.out.println("num3 is the largest " + num3);
			}
		}else {
			if(num2>num1) {
				System.out.println("num2 is the largest " + num2);
			}else if (num2 > num3){
				System.out.println("num3 is the largest " + num3);
			}
		}
		
	
	}

}
