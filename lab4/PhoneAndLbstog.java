public class PhoneAndLbstog {

	public static void main(String[] args) {

		PhoneNumber Bob = new PhoneNumber();
		PhoneNumber Isaiah = new PhoneNumber("Isaiah",309,8542823);
		
		System.out.println("Name: " + Bob.getName() + "\nAreacode: " + Bob.getAreacode() + "\nNumber: " + Bob.getNumber());
		System.out.println("\nName: " + Isaiah.getName() + "\nAreacode:  " + Isaiah.getAreacode() + "\nNumber: " + Isaiah.getNumber());
		
		Lbstog yes = new Lbstog(10);
		System.out.println(yes.answer());
		

	}

}
