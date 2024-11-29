package interfaces;

public class Dog extends Animal implements CanHavePizza{
	
	
	private String breed;
	
	public Dog(String name, int age, String breed) {
		super();
		this.breed = breed;
	}
	
	public Dog() {
		
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return super.toString() + " and breed:" + breed;
	}
	
	@Override
	public void eatPizza() {
		System.out.println("Dog have eaten the pizza");
	}
	
	
	
	
	

}
