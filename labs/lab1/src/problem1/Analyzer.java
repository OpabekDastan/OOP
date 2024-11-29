package problem1;
import java.util.Scanner;
public class Analyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		
		while(true) {
			System.out.println("Enter number (Q to quit):");
			String input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("Q")) {
				break;
			}
			try {
				double value = Double.parseDouble(input);
				data.inputValue(value);
			}catch(NumberFormatException e) {
				System.out.println("Invalid input, try again or input 'Q' to quit");
			}
			
		}
		System.out.println("Average = " + data.getAvg());
		System.out.println("Max = " + data.getMax());
		scanner.close();
	}

}
