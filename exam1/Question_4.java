import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String last;
		boolean found = false;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 5 words, 1 at a time");
		String[] words = new String[5];
		
		for (int i = 0; i<5; i++){
			words[i] =a.next();
		}
		
		last = words[0];
		
		System.out.println();
		
		for (int i = 1; i<5; i++){
			//The else if statement determines which word is longer, and will use that word's length for the for loop
			if (last.length()>words[i].length()){
				//The for loop will loop through each letter in the word and compare them
				for (int x =0; i<words[i].length(); x++){
					//If the letter in word comes second then it will become the last word
					if (words[i].charAt(x) < last.charAt(x)){
						last = words[i];
					}
					//If the letter comes before the other then it will break this for loop
					if (words[i].charAt(x) > last.charAt(x)){
						break;
					}
					
					//If neither it will continue looping
					//If it runs out of letters, and neither of these cases are true then last is longer and will remain the last word
					
				}
				
			}
			
			//same goes for this loop
			else{
				for (int x =0; x<last.length(); x++){
					if (words[i].charAt(x) < last.charAt(x)){
						last = words[i];
					}
					else if (words[i].charAt(x) > last.charAt(x)){
						break;
					}
					//If this case runs out of letters then it needs to make last = words[i] because words is a longer word
					//If bananas is being compared to banana then it will see that bananas is longer and make it the last word
					else if (x==last.length()-1){
						last = words[i];
						break;
					}
					
				}
			}
		}
		System.out.println("The last word alphabetically of the words you entered is: " + last);
		
		
	}


}
