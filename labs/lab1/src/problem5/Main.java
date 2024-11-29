package problem5;

public class Main {

	public static void main(String[] args) {
		 DragonLaunch d = new DragonLaunch(); 
		  d.kidnap(new Person(Gender.BOY)); 
		        d.kidnap(new Person(Gender.GIRL)); 
		        d.kidnap(new Person(Gender.BOY)); 
		        d.kidnap(new Person(Gender.GIRL)); 
		        if(d.willDragonEat()) { 
		         System.out.println("Dragon will eat all people ;(((("); 
		        } 
		        else { 
		         System.out.println("We are safe!"); 
		        } 

	}

}
