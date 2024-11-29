package examples;

/*public class Example3
{
    public static void main(String[] args)
    {
	int i;
	int[] data = {50, 320, 97, 12, 2000};


	try 
        {
	    for (i=0; i < 10; i++)
            {
		System.out.println(data[i]);
	    }
	} 
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
	    System.out.println("Done");
	}
    }
}
*/

//Modify Example3 so that it loops "properly" and does not need to use a try-catch statement. 
//(Note: The output should not change.) What did you change?


public class Example3
{
    public static void main(String[] args)
    {
	int i;
	int[] data = {50, 320, 97, 12, 2000};
	for (i=0; i < data.length; i++)
    {
		System.out.println(data[i]);
    }
	System.out.println("Done");
	
    }
}