package interfaces;

public class Main {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Dastan", 18, 4500);
		Student s2 = new Student("Bekzat", 19, 1000);
		
		Dog d1 = new Dog("Aktos",3,"labrador");
		
		Restaurant r1 = new Restaurant("Qaganat",200000);
		
		s2.eatPizza();
		
		System.out.println(r1.getKapital());
		r1.servePizza(s1);
		System.out.println(r1.getKapital());
		
		r1.servePizza(d1);
		
		Dog d2 = (Dog) new Animal("Bobik", 4);

	}

}
