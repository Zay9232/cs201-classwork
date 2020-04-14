import java.util.Scanner;
public class Temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		double F1, C1, F2, C2;
		
		/*                         Test Table
		 * Test Condition    Test Data     Expected Result     Actual Result  
		 * Low temp, F		 -12F		   -24.4444C           -24.4464C
		 * Low temp, C		 -5C           23F                 23F
		 * Med temp, F		 52F           11.1111C            11.112C
		 * Med Temp, C		 15C           59F				   59F
		 * High Temp, F      104F          40C				   40.0032C
		 * High Temp, C      38C           100.4F	    	   100.4F
		 * 
		 * Used google to find the Expected Results
		 */
		
		System.out.println("Enter a temp in F and it will be converted to C");
		F1 = a.nextDouble();
		C1 = (F1 - 32)*.5556;
		System.out.println(F1+"F is " +C1 +"C");
		System.out.println("");
		System.out.println("Enter a temp in C and it will be converted to F");
		C2 = a.nextDouble();
		F2 = (C2*1.8)+32;
		System.out.println(C2+"C  is "+F2+"F");
		
		/*
		 * All results found were either exactly right or were at least very
		 * similar to the point where there is no difference.
		 */
		
	}

}
