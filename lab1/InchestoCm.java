import java.util.Scanner;

public class InchestoCm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double in, cm;
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number of inches and it will be converted to CM");
		in = a.nextDouble();
		cm = in*2.54;
		System.out.println(in+"in is equal to "+cm+"cm");

		/*								Test Table
		 * Test Condition		Test Data		Expected		Actual
		 * low num				12in			30.48cm         30.48cm
		 * high num				57in			144.78cm		144.78cm
		 * medium num			73in			185.42cm		185.420000000002cm
		 */
		
	}

}
