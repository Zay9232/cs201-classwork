
import java.util.Scanner;
public class Exercises {

	public static void main(String[] args) {
		
		//Exercise 1
		Scanner a = new Scanner(System.in);
		String name;
		
		System.out.println("What is your name?");
		name = a.nextLine();
		System.out.println("Hello, " + name + ".");
		
		//Exercise 2
		System.out.println("");
		int age=18, dadage = 41, birthyear = 1998, height = 75, feet = 0, inches = 0;
		System.out.println("My fathers age minus my age is (41 - 18) = " + (dadage - age));
		System.out.println("My birth year times 2 is:  (1998*2) = " +(birthyear*2));
		System.out.println("My height from inches to cm is (75 * 2.54) = " + height*2.54+"cm");
		feet = 75/12;
		inches = 75-(feet*12);
		System.out.println("My height is " + feet +"'" + inches +"\"" );
		
		//Exercise 3
		System.out.println("");
		System.out.println("What is your name again? lo siento pero se me olvido");
		name = a.nextLine();
		System.out.print("If your name is " + name + " then your first initial is " + name.charAt(0));
		
		
	}

}
