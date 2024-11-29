package problem5;

enum Gender{ 
	 BOY, GIRL; 
	} 
public class Person {
	private Gender gender; 
	  
	 public Person(Gender gender) { 
	  this.gender = gender; 
	 } 
	  
	 public Gender getGender() { 
	  return gender; 
	 } 
	  
	 public String toString() { 
	  if(gender == Gender.BOY) { 
	   return "B"; 
	  } 
	  return "G"; 
	   
	 }  
}
