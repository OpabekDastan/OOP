package Spy;

public class Person {
	private int code;
	
	public Person(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public String toString() {
        return "МИРНЫЙ КОД:  " + code;
    }
	
}
