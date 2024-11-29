package problem5;
import java.util.Vector;
public class DragonLaunch {
	private Vector<Person> kidnappedPeople = new Vector<>(); 
	 public void kidnap(Person p) { 
	  kidnappedPeople.add(p); 
	 } 
	 public boolean willDragonEat() { 
	  int balance = 0; 
	  for(Person ch : kidnappedPeople) { 
	   if(ch.getGender()==Gender.BOY) { 
	    balance++; 
	   } 
	   else { 
	    if(balance>0) { 
	     balance--; 
	    } 
	    else { 
	     return true; 
	    } 
	   } 
	    
	  } 
	  return false; 
	 } 
}
