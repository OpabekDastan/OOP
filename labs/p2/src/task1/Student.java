package task1;

public class Student {
	private String name;
	private int id;
	private int yearOfstudy;
	

	public Student(String name, int id){
		this.name = name;
		this.id = id;
		this.yearOfstudy = 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

public int getId() {
	return id;
	
}
public void setId(int id) { 
	this.id = id;
}
public int getYearOfstudy() {
	return yearOfstudy;
}
public void incrementYear() {
	yearOfstudy++;
}
public void displayInfo() {
	System.out.println("Name:" + name );
	System.out.println("ID:" + id);
	System.out.println("Year:" + yearOfstudy);
}
}