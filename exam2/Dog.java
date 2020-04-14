package exam;

public class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}
	
	public void speak(){
		System.out.println("Woof!");
	}
	
	public String toString(){
		return "Dog: " + name;
	}
	
	

}
