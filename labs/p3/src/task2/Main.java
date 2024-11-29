package task2;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) {
		HashSet<Person>peoples = new HashSet<>(); 

		Person person1 = new Person("Opabek Dastan", "Almaty 1");
		Student student1 = new Student("Jantore", "Kaskelen", "Information Systems", 2, 5000.0);
		Staff staff1 = new Staff("Askat Kudaibergenov", "calc cabinet", "School of Math", 10000);

		
		peoples.add(person1);
		peoples.add(student1);
		peoples.add(staff1);
		
		for(Person person : peoples) {
			System.out.println(person);
		



	}


}
}