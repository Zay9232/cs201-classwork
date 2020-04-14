import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		int total, current;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number: ");
		total = a.nextInt();
		
		while (total > 0){
			current = total;
			while (current > 0){
				current--;
				if (current == 0){
					System.out.println("*");
				}
				else{
					System.out.print("*");
				}
			}
			total--;
		}

	}

}
