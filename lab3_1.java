import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

//no

public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = null;
		Scanner a = new Scanner(System.in);
		String input = "nope";
		int inputnumber, count=0, arraylen = 1;
		int[] numbers = new int[arraylen];
		
		
		while (!input.equalsIgnoreCase("done")) {
			System.out.println("Enter a number, or if you're done enter the word done:  ");
			input = a.nextLine();
			if (!input.equalsIgnoreCase("done")) {
				try {
					inputnumber = Integer.parseInt(input);
					try {
						numbers[count] = inputnumber;
						count++;
					}
					catch(ArrayIndexOutOfBoundsException e){
						arraylen++;
						int[] numbers2 = new int[arraylen];
						for(int i=0; i<numbers.length;i++) {
							numbers2[i]=numbers[i];
						}
						numbers2[count]=inputnumber;
						count++;
						numbers = numbers2;	
					}
				}
				catch(NumberFormatException e) {
					System.out.println("That wasn't one of the choices");
					
				}
			}
		}		
		System.out.println("What would you like to name the file to save to?: ");
		filename = a.nextLine();
		try {
			File file = new File(filename);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int x=0; x<numbers.length;x++) {
				bw.write(Integer.toString(numbers[x]));
				bw.write("\n");
			}
			bw.close();
			System.out.print("It all worked!");
		
		}	
		catch(IOException e){
			System.out.println("Its broke" + e);
		}		
		
	}

}