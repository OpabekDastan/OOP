package fourth;
import java.util.*;
/*
       ------1.What functionality does a StringTokenizer object provide? Give example.-------
)public class TokenizerExample {

    public static void main(String[] args) {
        String str = "Java, Python, C++";
        StringTokenizer tokenizer = new StringTokenizer(str, ", ");
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
Ответ вышел такой:
Java
Python
C++
String Tokenizer это класс который разделяет строку на части в зависимости от символа типа как пробела запятой и тд


---------2.What are the three formal parameters of the explicit value  constructor in the StringTokenizer class? Give example.---------

Конструктор класса StringTokenizer принимает три параметра:

Строку, которую нужно разбить на токены.
Разделитель (или несколько символов разделителя).
Логическое значение, указывающее, нужно ли считать разделители как отдельные токены. 

StringTokenizer tokenizer = new StringTokenizer("Java:Python:C++", ":", true);

--------3)	Run Example4.java. 	After running the program  write the following to the command line: 5.3+9.2------------------
ответ это сложение 
5.3+9.2
Result: 14.5
------------4)	Now run it again and enter the following:  5.3+    What output is generated?
5.3+
Invalid syntax
нет второго числа
NoSuchElementException сработал
-------------5)         Why?  In particular, what exception is thrown and why?

	Run again and enter 5.3+a.

What output is generated?

5,3+a
One or more operands is not a number
сработало NumberFormatException

example4
public class Example4 {
	 public static void main(String[] args)
	    {
	       double                 leftOperand, result, rightOperand;
	       String                 leftString, operator, rightString;
	       StringTokenizer        tokenizer;
	       Scanner in = new Scanner(System.in);

	       tokenizer = new StringTokenizer(in.nextLine(), "+", true);

	       try
	       {
	          leftString   = tokenizer.nextToken();
	          operator     = tokenizer.nextToken();
	          rightString  = tokenizer.nextToken();

	          leftOperand  = Double.parseDouble(leftString);
	          rightOperand = Double.parseDouble(rightString);

	          if (operator.equals("+"))
	             result = leftOperand + rightOperand;
	          else
	             result = 0.0;

	          System.out.println("Result: " + result);
	       }
	       catch (NoSuchElementException nsee)
	       {
	          System.out.println("Invalid syntax");
	       }
	       catch (NumberFormatException nfe)
	       {
	          System.out.println("One or more operands is not a number");
	       }


	    }

}


 */

//5.Modify
public class Example4{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       
	       String input = in.nextLine();
	       String[] expressions = input.split(" ");

	       

	       for(String elem: expressions) {
	    	   StringTokenizer        tokenizer = new StringTokenizer(elem, "+-*/", true);
	    	   try
	           {
	              String leftString   = tokenizer.nextToken();
	              String operator     = tokenizer.nextToken();
	              String rightString  = tokenizer.nextToken();

	              double leftOperand = 0.0;
	              double rightOperand = 0.0;
	               try {
	            	   leftOperand = Double.parseDouble(leftString);
	               }catch(NumberFormatException nfe) {
	            	   System.out.println("Left operand is not a number");
	            	   continue;
	               }
	               
	               try {
	            	   rightOperand = Double.parseDouble(rightString);
	               }catch(NumberFormatException nfe) {
	            	   System.out.println("Right operand is not a number");
	            	   continue;
	               }
	               
	               double result = 0.0;

	              if (operator.equals("+"))
	                 result = leftOperand + rightOperand;
	              else if (operator.equals("-"))
	                  result = leftOperand - rightOperand;
	              else if (operator.equals("*"))
	                  result = leftOperand * rightOperand;
	              else if (operator.equals("/"))
	                  result = leftOperand / rightOperand;
	              else
	                 result = 0.0;

	              System.out.println("Result: " + result);
	           }
	           catch (NoSuchElementException nsee)
	           {
	              System.out.println("Invalid syntax");
	              continue;
	             
	           }
	           catch (NumberFormatException nfe)
	           {
	              System.out.println("One or more operands is not a number");
	           }
	       }
	    in.close();   
	}
}