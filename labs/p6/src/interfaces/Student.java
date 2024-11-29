package interfaces;

public class Student extends Person implements CanHavePizza{
	
	private double balance;
	
	public Student(String name, int age, double balance) {
		super();
		this.balance = balance;
	}
	
	public Student() {
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return super.toString() + " with balance " + balance;
	}
	
	@Override
	public void eatPizza() {
		if(balance >= 3000) {
			balance -= 3000;
			System.out.println("Student bought and ate pizza");
		}
		else {
			System.out.println("Student couldn't buy a pizza cause he has not enough money");
		}
	}
	

}
