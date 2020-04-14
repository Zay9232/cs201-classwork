package lab7;

public class InsertionSort {

	//a
	
	public static String[] InsertionSort(String a[]) {
		String word;
		
		for (int i=1; i<a.length; i++) {
			word = a[i];
			int j;
			for (j = i-1; (j>=0) && (a[j].compareToIgnoreCase(word) > 0); j--) {
				a[j+1] = a[j];
			}
			a[j+1] = word;
		}
		return a;
	}

	public static void main(String[] args) {
		String[] words = {"cat", "fat", "dog", "apple", "bat", "egg"};
		for (String b: InsertionSort(words)) {
			System.out.print(b+",");
		}

	}

}
