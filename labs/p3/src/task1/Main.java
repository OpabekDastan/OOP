package task1;

public class Main { 

	public static void main(String[] args) { 
		Dog defaultDog = new Dog();   
		defaultDog.sound();  


		System.out.println("Dog size: " + defaultDog.getAvg());   
		System.out.println("Average size of animal: " + defaultDog.getParentAvg()); 

		Dog customDog = new Dog(30);  
		System.out.println("Dog size: " + customDog.getAvg());   
		System.out.println("Average size of animal: " + customDog.getParentAvg()); 

		Animal animal = new Dog(); 
		System.out.println(animal.getAvg()); 

	} 

}