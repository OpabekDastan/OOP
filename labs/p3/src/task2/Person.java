package task2;

public class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;	
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
	    return String.format("Person:\n\tName: %s\n\tAddress: %s\n", name, address);
	}

}	