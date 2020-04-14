package exam;

public class Circle {

	private double radius;
	
	public Circle() {
		radius = 0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double area(){
		return (3.14*(radius*radius));
	}
	public double circumference(){
		return (2*3.14*radius);
	}
	
	public String toString(){
		return "Circle:  r = " + radius;
	}
	
	public boolean equals(Circle other){
		if (other.radius == radius){
			return true;
		}
		else return false;
	}

}
