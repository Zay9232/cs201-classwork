package exam;

public class Student {

	private String name;
	private int id;
	
	public Student() {
		name = "";
		id = 0;
	}
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	
	public String toString(){
		return "Student " + name + "  ID: " +id;
	}
	
	public boolean equals(Student other){
		if (other.getName().equals(name) && other.getId() == id){
			return true;
		}
		else{
			return false;
		}
	}

}
