package exam;

public class Sphere extends Circle {

	
	public Sphere() {
		super();
	}

	public Sphere(double radius) {
		super(radius);
	}
	
	public double volume(){
		return ((4/3)*3.14*(getRadius()*getRadius()*getRadius()));
	}
	
	public String toString(){
		return "Sphere:  radius = " + getRadius();
	}
	
	
	

}
