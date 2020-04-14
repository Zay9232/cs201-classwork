package lab7;

public class BubbleSort {

	//b
	
	public static int[] BubbleSort( int[] a) {
		boolean loop = true;
		int temp = 0;
		int i;
		
		while(loop) {
			loop = false;
			for (i=0;i<a.length-1;i++) {
				if (a[i]> a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					loop = true;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] nums = {10, 4, 7, 3, 8, 6, 1, 2, 5, 9};
		
		for (int i: BubbleSort(nums)) {
			System.out.print(i+",");
		}

	}

}
