package Student;

public class Student2 {
	 
		private String name;
		private int id;
		private int yearOfstudy;
		private double grade;
		

	public Student2(String name, int id){
		this.name = name;
		this.id = id;
		this.yearOfstudy = 1;
	}
	public String getName(){
		return name;
	}
	public int getId() {
		return id;
	}
	public void incrementYear() {
		yearOfstudy++;
	}
	public int getYearOfstudy() {
		return yearOfstudy;
	}
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
		
	}
	public String toString() {
		return "Student: " + name + ", ID: " + id + ", Year: " + yearOfstudy + ", Grade: " + grade; 
	}
}
