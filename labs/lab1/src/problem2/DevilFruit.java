package problem2;

enum DevilFruitType {
    PARAMECIA, ZOAN, LOGIA
}

public class DevilFruit {

    private static int fruitCount;


    private final String name; 
    private final DevilFruitType type;
    



    private String user; 

    public static final String CURSE = "The user loses the ability to swim.";


    {
        System.out.println("A new DevilFruit has been discovered...");
    }

    public DevilFruit(String name, DevilFruitType type) {
        this.name = name; 
        this.type = type;
        fruitCount++; 
    }

    
    public void setUser(String user) {
        this.user = user; 
    }

    
    public void setUser(String user, boolean printConfirmation) {
        this.user = user;
        if (printConfirmation) {
            System.out.println("The user of the fruit is now: " + this.user);
        }
    }

    
    public String getInfo() {
        return "Fruit Name: " + name + ", Type: " + type + ", User: " + user;
    }


    
    public static int getFruitCount() {
        return fruitCount;
    }
}
