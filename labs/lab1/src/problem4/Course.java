package problem4;

public class Course { 
	 private String name; 
	 private String description; 
	  
 
	  
	 public Course(String name, String description) { 
	        this.name = name; 
	        this.description = description; 
	        
	    } 
	 
	    @Override 
	    public String toString() { 
	        return this.name + " " + this.description; 
	    } 
	}