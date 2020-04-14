import java.util.Scanner;
public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, linesize = 1, currentsize = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What size triangle do you want?");
		size = input.nextInt();
		while (currentsize <= size) {
			linesize = currentsize;
			
			while (linesize > 0) {
				linesize--;
				if (linesize != 0) {
					System.out.print("*");
				}
				else {
					System.out.println("*");
				}
				
			}
			currentsize++;
		}
	}

}
