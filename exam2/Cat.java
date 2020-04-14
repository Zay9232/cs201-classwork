package exam;

public class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}
	
	public void speak(){
		System.out.println("Meow!");
	}
	
	public String toString(){
		return "Cat: " + name;
	}

}
