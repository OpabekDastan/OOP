package trenirovka;
import java.util.Scanner;
public class Belka {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	if((a*b)>=c) {
		System.out.print("YES");
	}
	else {
		System.out.print("NO");
		
	}
	
	scanner.close();
	}
}
