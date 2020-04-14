import java.util.Scanner; 
public class Question_2 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = a.nextInt();
		
		if (input%12 == 0){
			System.out.println("foobar");
		}
		else if (input%4 == 0){
			System.out.println("bar");
		}
		else if (input%3 == 0){
			System.out.println("foo");
		}
	}

}
