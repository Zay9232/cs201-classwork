import java.util.Scanner;
public class Exercise_2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		double grades = 0, input = 0, average;
		int counter = 0;
		
		while (input!=-1) {
			System.out.println("Please enter a grade, or enter -1 to stop and calculate average");
			input = a.nextDouble();
			if (input != -1) {
				grades += input;
				counter++;
			}
			else {
				average= grades/counter;
				System.out.println("Your average is " + average);
			}
		}


	}

}
