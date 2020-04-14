package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<Double>();
		double b = 0,  total = 0;


		while (b >= 0){
			System.out.println("Enter a positive number or a negative number to quit");
			b = a.nextInt();
			if (b > -1){
				numbers.add(b);
			}
		}

		for (Double i: numbers){
			total+=i;
		}


		System.out.println(total/numbers.size());

	}

}
