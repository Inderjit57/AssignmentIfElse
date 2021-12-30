
public class AssignmentQuestion3_2 {

	public static void main(String[] args) {
		//Q3. Find the largest of 3 given numbers. Using nested IF operator
				int num1 = 1;
				int num2 = 0;
				int num3 = 9;		
				
				boolean ifGreater = (num1>num2) && (num1>num3) && (num2>num1) && (num2>num3) &&(num3>num1) && (num3>num2);
			
				if (num1>num2) 
				{
						if (num1>num3)
						{
							System.out.println("num1 is greater than num2 and num3:" + num1);
						}
						else 
						{
							System.out.println("try another number");
						}
			
				}
				
				else if (num2>num1)
				{
						if (num2>num3)
						{
							System.out.println("num2 is greater than num1 and num3:" + num2);
						}
						else 
						{
							System.out.println("try another number");	
						}
							
				}
				
				else if (num3>num1)
				{
					if (num3>num2)
					{
						System.out.println("num3 is greater than num1 and num2:" + num3);
					}
					else
					{
						System.out.println("try another number");
					}
				}
				
				else if (num1 == num2)
				{
					System.out.println("Numbers cannot be same");
						if (num2 == num3)
						{
							System.out.println("Numbers cannot be same");
						}
					
				}

	}

}
