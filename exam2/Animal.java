package exam;

public abstract class Animal {

	protected String name;
	
	public Animal() {
		name = "";
	}
	public Animal(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Animal: " + name;
	}
	
	public boolean equals(Animal other){
		if (name.equals(other.getName())){
			return true;
		}
		else return false;
	}
	
	public abstract void speak();

}
