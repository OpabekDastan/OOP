package interfaces;

public class Restaurant {
	
	private String name;
	private double kapital;
	
	public Restaurant(String name, double kapital) {
		this.name = name;
		this.kapital = kapital;
	}
	
	public Restaurant() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getKapital() {
		return kapital;
	}
	
	public void setKapital(double kapital) {
		this.kapital = kapital;
	}
	
	
	public void servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if(eater instanceof Student) {
			kapital += 3000;
		}
	}

}
