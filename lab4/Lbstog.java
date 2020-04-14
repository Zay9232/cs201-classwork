
public class Lbstog {

	private double pounds;
	
	public Lbstog() {
		this.pounds = 0;
	}
	public Lbstog(int a) {
		this.pounds = a;
	}
	
	//Accessor Method
	public double getPounds() {
		return pounds;
	}
	
	//Mutator Method
	public void setPounds(double a) {
		this.pounds = a;
	}
	
	//Conversion
	public double convert(double p) {
		return (p*453.592);
	}
	
	public String answer() {
		
		return (Double.toString(this.pounds)+"lbs  =  " + Double.toString(this.pounds*453.592)+"g");
	}

	//Now see PhoneandLbstog
}
