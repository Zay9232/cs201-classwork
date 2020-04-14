
public class PhoneNumber {

	private String name;
	private int areacode;
	private int number;
	
	//Default
	public PhoneNumber() {
		this.name = null;
		this.areacode = 0;
		this.number = 0;
	}
	//nonDefault
	public PhoneNumber(String a, int b, int c) {
		this.name = a;
		this.areacode = b;
		this.number = c;
	}
	
	//Accessor Methods
	public String getName() {
		return name;
	}
	public int getAreacode() {
		return areacode;
	}
	public int getNumber() {
		return number;
	}
	
	//Mutator Methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAreacode(int areacode) {
		this.areacode = areacode;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	//Number 5 - Full Number as string
	public String fullNumber() {
		return "(" + Integer.toString(areacode) + ") "+ Integer.toString(number);
	}
	
	//number 6 - areacode has a length of 3
	public boolean lenAreacode() {
		if (Integer.toString(areacode).length() == 3) {
			return true;
		}
		else {
			return false;
		}
	}
	//number 7 - number has a length of 7
	public boolean lenNumber() {
		if (Integer.toString(number).length() == 7) {
			return true;
		}
		else {
			return false;
		}
	}
	//number 8 (Optional) - Both are the right length
	public boolean lenFullnumber() {
		if (lenAreacode() == true && lenNumber() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//See PhoneAndLbstog for number 9

}
