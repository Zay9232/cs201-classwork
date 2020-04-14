import java.util.Scanner;
import java.io.IOException;
import java.io.File;

//a
public class Problem_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("grades.csv");
		Scanner a = new Scanner(file);
		String input;
		String people[] = new String[14];
		int grades = 0, avg;
		int count = 0;
		String grade;
		
		
		while (a.hasNextLine()) {
			input = a.nextLine();
			people[count] = input;
			count++;
		}
		for (int i=0;i<people.length;i++) {
			grade = "";
			for (int x=0; i<people[i].length();x++) {
				//Find where the comma is, the next two characters are the students grade
				if (people[i].charAt(x) == ','){
					grade += people[i].charAt(x+1);
					grade += people[i].charAt(x+2);
					grades += Integer.parseInt(grade);
					break;
				}
				
			}
		}
		
		avg = grades/14;
		System.out.println("The class avg is: " + avg+"%");
		
		a.close();

	}

}
