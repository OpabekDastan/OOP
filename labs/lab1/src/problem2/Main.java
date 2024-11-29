package problem2;

public class Main {

	public static void main(String[] args) {
		
        DevilFruit fruit1 = new DevilFruit("Gomu Gomu no Mi", DevilFruitType.PARAMECIA);
        DevilFruit fruit2 = new DevilFruit("Tori Tori no Mi", DevilFruitType.ZOAN);

        
        fruit1.setUser("bite d dast");
        fruit2.setUser("Marco");

        
        System.out.println(fruit1.getInfo());
        System.out.println(fruit2.getInfo());

        
        System.out.println("Total Devil Fruits discovered: " + DevilFruit.getFruitCount());

        
        System.out.println("Curse of the Devil Fruits: " + DevilFruit.CURSE);

	}

}
