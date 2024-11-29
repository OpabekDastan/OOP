package problem4;

import Student.Student2; 
import java.util.Scanner; 
public class GradeBook { 
    private Course course; 
    private Student2[] students; 
 
    public GradeBook(Course course, Student2[] students) { 
        this.course = course; 
        this.students = students;  
    } 
 
    public void displayMessage() { 
        System.out.println("Welcome to: " + course.toString()); 
    } 
 
    public void insertGrades() { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Insert grades!"); 
        for (Student2 student : this.students) { 
            System.out.print("Student " + student.getName() + ": "); 
            double grade = scanner.nextDouble(); 
            student.setGrade(grade); 
        } 
        scanner.close(); 
    } 
 
    public void getStatistics() { 
        double sum = 0, max = 0, low = 100; 
        String nameOfMax = ""; 
        String nameOfMin = ""; 
         
        for (Student2 student : this.students) { 
            double grade = student.getGrade(); 
            sum += grade; 
            if (grade > max) { 
                max = grade; 
                nameOfMax = student.getName(); 
            } 
            if (grade < low) { 
                low = grade; 
                nameOfMin = student.getName(); 
            } 
        } 
        System.out.println("Average: " + (sum / this.students.length)); 
        System.out.println("Highest grade is " + max + " by Student " + nameOfMax); 
        System.out.println("Lowest grade is " + low + " by Student " + nameOfMin); 
    } 
}