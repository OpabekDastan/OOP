package interfaces;

public class Animal {

	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal() {
		
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Animal with name:"+name +" and age:" + age;
	}
	
	
}
