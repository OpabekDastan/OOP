package task3;

public class Main {

	public static void main(String[] args) {
		Time t = new Time(22,7, 59);
		Time t2 = new Time(2, 8 , 44);
		Time t3 = new Time(4, 5 , 24);
        System.out.println(t.universal());   
        System.out.println(t.standard());    
        
        t3.add(t2);
        System.out.print(t3.universal());
    

	}

}
