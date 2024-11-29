package examples;

/*
public class Example2
{
    public static void main(String[] args)
    {
	int        i, ratio;
	int[]      numbers = {100,10,0,5,2,8,0,30};

	try
        {
	    for (i=0; i < numbers.length-1; i++)
            {
		ratio = numbers[i] / numbers[i+1];
		System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
	    }
	} 
        catch (ArithmeticException ae)
        {
	    System.out.println("Couldn't calculate "+
			       numbers[i]+"/"+numbers[i+1]);
	}
    }
}
*/

//What error was generated?
//My answer: error is that i is not initialized in catch block, and in catch we cannot access elements of an array numbers

//Initialize i to 0 inside of the try block (but before the for loop).
//Compile Example2.
//What error was generated?

/*
public class Example2
{
    public static void main(String[] args)
    {
	int  ratio;
	int[]      numbers = {100,10,0,5,2,8,0,30};

	try
        {
		int i = 0;
	    for (i=0; i < numbers.length-1; i++)
            {
		ratio = numbers[i] / numbers[i+1];
		System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
	    }
	} 
        catch (ArithmeticException ae)
        {
	    System.out.println("Couldn't calculate "+
			       numbers[i]+"/"+numbers[i+1]);
	}
    }
}*/

//What error was generated?
/*Мой ответ: Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	i cannot be resolved to a variable
	i cannot be resolved to a variable

	at pracice5\examples.Example2.main(Example2.java:54)
	
	Ошибка возникает потому, что переменная i инициализируется внутри блока try, 
	и компилятор не может гарантировать, что i будет инициализирована перед использованием 
	в блоке catch. Если произойдет исключение (например, деление на ноль), код в блоке catch 
	попытается обратиться к i, который может не существовать в контексте этого блока, так как его область видимости ограничена блоком try
	*/

/*
public class Example2
{
    public static void main(String[] args)
    {
	int  ratio;
	int[]      numbers = {100,10,0,5,2,8,0,30};
	int i = 0;
	try
        {
		
	    for (i=0; i < numbers.length-1; i++)
            {
		ratio = numbers[i] / numbers[i+1];
		System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
	    }
	} 
        catch (ArithmeticException ae)
        {
	    System.out.println("Couldn't calculate "+
			       numbers[i]+"/"+numbers[i+1]);
	}
    }
}
*/


//Move the initialization of i before the try block.
//Compile and execute Example2.
//What output is generated?
//Why aren't all of the divisions even attempted?

/*Мой ответ:
  вывод:
  
 100/10=10
Couldn't calculate 10/0

Потому что происходит деление на 0 и catch блок перехватывает ошибку и после выполнения операций catch блока программа останавливается


 */

/*Fix Example2 so that it executes properly. (Hint: Move the try-catch block inside of the
for block.) What did you change? What has happened?*/

public class Example2
{
    public static void main(String[] args)
    {
	int  ratio;
	int[]      numbers = {100,10,0,5,2,8,0,30};
	int i = 0;
	for(i = 0; i<numbers.length-1; i++) {
		try {
			ratio = numbers[i] / numbers[i+1];
			System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
		}catch(ArithmeticException ae) {
			System.out.println("Couldn't calculate "+
				       numbers[i]+"/"+numbers[i+1]);
		}
	}
	
}
}


