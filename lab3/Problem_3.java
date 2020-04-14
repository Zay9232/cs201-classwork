
//c
public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116, 104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109, 98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 32, 62421};
		
		int minimum = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if (numbers[i]<minimum) {
				minimum = numbers[i];
			}
			
		}
		System.out.println(minimum);
	}

}
