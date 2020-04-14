package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;





public class CTAStopApp {

	public static void main(String[] args) {
		CTAStation stations[] = new CTAStation[58];
		CTAStation addStation = new CTAStation();
		CTARoute greenLine = new CTARoute("Green Line", new ArrayList<CTAStation>(30));
		CTARoute redLine = new CTARoute("Red Line", new ArrayList<CTAStation>(30));
		ArrayList<CTAStation> current;
		File file = new File("CTAStops.csv");
		boolean wheel;
		boolean open;
		boolean exit = false;
		int choice = 0;
		int choice1 = 0;
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
		while (counter < 59) {
			String input = a.nextLine();
			if (counter != 0) {
				String inputs[] = input.split(",");
				if (inputs[4].equals("TRUE")) wheel = true;
				else wheel = false;
				if (inputs[5].equals("FALSE")) open = false;
				else open = false;
				stations[counter-1] = new CTAStation(inputs[0],inputs[3],open,wheel,Double.parseDouble(inputs[1]),Double.parseDouble(inputs[2]));
				if (Integer.parseInt(inputs[5]) != -1) {
					//redLine.insertStation(stations[counter-1], Integer.parseInt(inputs[5]));
					redLine.addStation(stations[counter-1]);
				}
				if (Integer.parseInt(inputs[6]) != -1) {
					//greenLine.insertStation(stations[counter-1], Integer.parseInt(inputs[6]));
					greenLine.addStation(stations[counter-1]);
				}
			}
			counter++;
		}
		
		while (exit == false) {
			System.out.println("what would you like to do? \n 1. Display Station Names  \n 2. Display Stations with Accessibility \n 3. Display Station information\n 4. Add Station \n 5. Delete Station \n 6. Exit");
			try{
				choice = b.nextInt();
			} catch(NumberFormatException e) {
				System.out.println("That is not a choice");
			}
			while (choice == 1) {
				System.out.println("Which Station? \n1. Green Line \n2. RedLine \n3. Back");
				
				try{
					choice1 = b.nextInt();
				} catch(NumberFormatException e) {
					System.out.println("That is not a choice");
				}
				if (choice1 == 1) {
					current = greenLine.getStations();
					for (int i = 0; i < current.size(); i++) {
						System.out.println(current.get(i).getName());
					}
					choice = 0;
				}
				if (choice1 == 2) {
					current = redLine.getStations();
					for (int i = 0; i < current.size(); i++) {
						System.out.println(current.get(i).getName());
					}
					choice = 0;
				}
				if (choice1 == 3) {
					choice = 0;
				}
			}
			while (choice == 2) {
				System.out.println("Would you like to show wheel chair acessable stations (y/n)");
				try {
					choice2 = b.nextLine();
					if (choice2.equals("y")) {
						System.out.println("for which station? \n1. Green Line \n2. Red Line");
						choice1 = b.nextInt();
						if (choice1 == 1) {
							current = greenLine.getStations();
							for (int i = 0; i < current.size(); i++) {
								if (current.get(i).getWheelchair() == true) {
									System.out.println(current.get(i).getName());
								}
							}
						}
						if (choice1 == 2) {
							current = redLine.getStations();
							for (int i = 0; i < current.size(); i++) {
								if (current.get(i).getWheelchair() == true) {
									System.out.println(current.get(i).getName());
								}
							}
						}
						
						choice = 0;
					}
					if (choice2.equals("n")) {
						System.out.println("for which station? \n1. Green Line \n2. Red Line");
						choice1 = b.nextInt();
						if (choice1 == 1) {
							current = greenLine.getStations();
							for (int i = 0; i < current.size(); i++) {
								if (current.get(i).getWheelchair() == false) {
									System.out.println(current.get(i).getName());
								}
							}
						}
						if (choice1 == 2) {
							current = redLine.getStations();
							for (int i = 0; i < current.size(); i++) {
								if (current.get(i).getWheelchair() == false) {
									System.out.println(current.get(i).getName());
								}
							}
						}
						
						choice = 0;
					}
				} 
				catch(NumberFormatException e) {
					System.out.println("Enter either y or n");
				}
			
			}
			while (choice == 3) {
				System.out.println("Would you like to show information for \n1. A station \n2. All Stations");
				choice1 = b.nextInt();
				System.out.println("Which Station \n1. Green Line \n2. Red Line");
				int choice3 = b.nextInt();
				if (choice1 == 1) {
					System.out.println("Enter the Station you want");
					String yes = null;
					yes = b.next();
					CTAStation ans = new CTAStation();
					if (choice3 == 1) {
						ans = greenLine.lookupStation(yes);
						if(ans.equals(null)) {
							System.out.println("Does not exist");
						}
						else {
							System.out.println(ans.toString());
						}
						
					}
					if (choice3 == 2) {
						ans = greenLine.lookupStation(yes);
						if(ans.equals(null)) {
							System.out.println("Does not exist");
						}
						else {
							System.out.println(ans.toString());
						}
						
					}
					choice = 0;
				}
				if (choice1 == 2) {
					System.out.println("YEP");
					if (choice3 == 1) {
						System.out.println("YES");
						for (int i = 0; i < greenLine.getStations().size(); i++) {
							System.out.println(greenLine.getStations().get(i).toString());
						}
					}
					if (choice3 == 2) {
						for (int i = 0; i < redLine.getStations().size(); i++) {
							System.out.println(redLine.getStations().get(i).toString());
						}
					}
					choice = 0;
				}
					
				
			}
			if (choice == 4) {
				System.out.println("Make a Station name");
				addStation.setName(b.next());
				System.out.println("Enter Longitude");
				addStation.setLongitude(b.nextDouble());
				System.out.println("Enter Latitude");
				addStation.setLongitude(b.nextDouble());
				System.out.println("Enter Location");
				addStation.setLocation(b.next());
				System.out.println("wheelchair accessable? (y/n)");
				choice2 = b.next();
				if (choice2.equalsIgnoreCase("y")) {
					addStation.setWheelchair(true);
				}
				else {
					addStation.setWheelchair(true);
				}
				choice1 = 0;
				while (choice1 != 1 && choice1 != 2 && choice1 != 3) {
					System.out.println("1. Green line \n2. Red Line \n3. Cancel");
					choice1 = b.nextInt();
					if (choice1 == 1) {
						greenLine.addStation(addStation);
					}
					if (choice1 == 2) {
						redLine.addStation(addStation);
					}
				}
				
				
			}
			
			while (choice == 5) {
				System.out.println("Which route? \n1. Green Line \n2. Red Line \n3. quit");
				choice1 = b.nextInt();
				if (choice1 == 3) {
					choice = 0;
				}
				if (choice1 == 1) {
					System.out.println("enter station name?");
					choice2 = b.next();
					greenLine.removeStation(choice2);
				}
				if (choice1 == 1) {
					System.out.println("enter station name?");
					choice2 = b.next();
					redLine.removeStation(choice2);
				}
				
			}
		}
		
		
		
		
		
		 
		
	}

}
