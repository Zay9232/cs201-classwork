import java.util.Scanner;
public class BoxWood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		double x, y, z, SA;
		//x = length, y = height, z = width;
		
		//Formula for Surface Area for a box with a top= 2xy + 2zy + 2xz
		
		System.out.println("What is the length (in inches) of the box?");
		x = a.nextDouble()/12;
		System.out.println("what is the width (in inches) of the box?");
		z = a.nextDouble()/12;
		System.out.println("What is the height (in inches) of the box?");
		y = a.nextDouble()/12;
		
		
		System.out.println("the box is "+x+"ft x "+z+"ft x "+y+"ft");
		
		SA = (2*(x*y)) + (2*(z*y) + (2*(x*z)));
		System.out.println("To make the box you will need " + SA + "ft^2 of wood");
		
		/*							Test Table
		 * Test Condition		Test Data		Expected Result		Actual Result
		 * small numbers		 24x24x42		  24ft^2			 24.0ft^2
		 * medium numbers		 72x60x72		  192ft^2			 192.0ft^2
		 * large numbers  		 132x120x132      682ft^2            682ft^2
		 * 						 (x,z,y)
		 */						  
		
	}

}
