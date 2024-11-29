package task1;

public class Animal { 
	int avgMass;
	public Animal() {
		this.avgMass = 52;
	}
	public Animal(int avgSize) {
		this.avgMass = avgSize;
	}
	public int getAvg() {
		return avgMass;
	}
	public void sound() {
		System.out.print("the animal makes a sound...");
	}

}
