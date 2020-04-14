import java.util.Scanner;
public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int input = 0, num1, num2, ans;
		
		while (input != 4) {
			System.out.println("-----Menu-----"+"\n1. Say Hello"+"\n2. Addition"+"\n3. Multiplication"+"\n4. Quit");
			input = a.nextInt();
			if (input == 1) {
				System.out.println("Hello!");
			}
			else if ( input == 2) {
				System.out.println("What is the first number?");
				num1 = a.nextInt();
				System.out.println("What is the second number?");
				num2 = a.nextInt();
				ans = num1 + num2;
				System.out.println("Your answer is " + ans);
			}
			else if ( input == 3) {
				System.out.println("What is the first number?");
				num1 = a.nextInt();
				System.out.println("What is the second number?");
				num2 = a.nextInt();
				ans = num1 * num2;
				System.out.println("Your answer is " + ans);
			}
			else if (input != 4) {
				System.out.println("\nThat is not an option");
			}
		}
	}

}
