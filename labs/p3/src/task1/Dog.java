package task1;

public class Dog extends Animal{ 
	public Dog() { 
		super.sound();     ///перегрузка метода overloading
		this.avgMass = 20; 
	} 

	public Dog(int avgSize) { 
		super(avgSize); 	// тоже перегрузка с парент классом
		this.avgMass = avgSize; 
	} 
	@Override
	public void sound() { 
		System.out.println("The dog say: GAV GAV GAV!"); 
	} 

	public int getAvg() { 
		return avgMass; 
	} 
	public int getParentAvg() {
		return super.getAvg();
	}
}	