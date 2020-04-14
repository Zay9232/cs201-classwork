package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;






public class CTAStopApp {

	public static void main(String[] args) {
		CTAStation stations[] = new CTAStation[27];
		File file = new File("greenLineStops.csv");
		boolean wheel;
		boolean open;
		boolean exit = false;
		int choice = 0;
		String choice2 = "";
		Scanner a = null;
		Scanner b = new Scanner(System.in);
		int counter=0;
		try {
			a = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (counter < 28) {
			String input = a.nextLine();
			if (counter != 0) {
				String inputs[] = input.split(",");
				if (inputs[4].equals("TRUE")) wheel = true;
				else wheel = false;
				if (inputs[5].equals("FALSE")) open = false;
				else open = false;
				stations[counter-1] = new CTAStation(inputs[0],inputs[3],open,wheel,Double.parseDouble(inputs[1]),Double.parseDouble(inputs[2]));
			}
			counter++;
		}
		
		while (exit == false) {
			System.out.println("what would you like to do? \n 1. Display Station Names  \n 2. Display Stations with Accessibility \n 3. Display the Distance to each station \n 4. Exit");
			try{
				choice = b.nextInt();
			} catch(NumberFormatException e) {
				System.out.println("That is not a choice");
			}
			if (choice == 1) {
				for (int i = 0; i < 27; i++) {
					System.out.println(stations[i].getName());
				}
			}
			while (choice == 2) {
				System.out.println("Would you like to show wheel chair acessable stations (y/n)");
				try {
					choice2 = b.nextLine();
					if (choice2.equals("y")) {
						for (int i = 0; i < 27; i++) {
							if (stations[i].getWheelchair() == true) {
								System.out.println(stations[i].getName());
							}
						}
						choice = 0;
					}
					if (choice2.equals("n")) {
						for (int i = 0; i < 27; i++) {
							if (stations[i].getWheelchair() == false) {
								System.out.println(stations[i].getName());
							}
						}
						choice = 0;
					}
				} catch(NumberFormatException e) {
					System.out.println("Enter either y or n");
				}
			
			}
			
			if (choice == 4) {
				exit = true;
			}
		}
		
		
		
		
		
		 
		
	}

}
