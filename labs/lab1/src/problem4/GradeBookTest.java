package problem4;

import Student.Student2; 
public class GradeBookTest { 
 
 public static void main(String[] args) { 
   Course course = new Course("Object_oriented programming", "Learn the basics of OOP"); 
         Student2[] students = { 
             new Student2("Dastan", 1), 
             new Student2("Nurtas", 2), 
             new Student2("Kairat", 3) 
         }; 
          
         GradeBook gradeBook = new GradeBook(course, students); 
         gradeBook.displayMessage(); 
         gradeBook.insertGrades();  
         gradeBook.getStatistics();  
     } 
 
 }