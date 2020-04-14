import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer;
		Scanner a= new Scanner(System.in);
		System.out.println("enter a number 1-10: ");
		int input = a.nextInt();
		answer = (input*2) + 65;
		char b = (char) answer;
		System.out.println(b);

	}
}