package Spy;
import java.util.Vector;
import java.util.Random;
public class Main{
	private static int spycnt = 0;
	public static void main(String[] args) {
		Vector<Object> people = new Vector<>();
		Random random = new Random();
		
		
		for(int i = 0; i < 5; i++) {
			int code = random.nextInt(50)+1;
			
			if(SpyDetector.isPowerOfTwo(code)) {
				people.add(new Shpion(code));
				spycnt++;
			}
			else{
				people.add(new Person(code));
			}
		}
        if (spycnt == 1) {
            System.out.println("ИМПОСТЕР ОБНАРУЖЕН.");
        }  
        else if(spycnt == 0) {
            System.out.println("ИМПОСТЕРОВ НЕТ.");
        }
        else if(spycnt == 2) {
            System.out.println("ДВА ИМПОСТЕРА.");
        }
        else if(spycnt == 3) {
            System.out.println("ТРИ ИМПОСТЕРА.");
        }    
        else if(spycnt == 4) {
            System.out.println("ЧЕТЫРЕ ИМПОСТЕРА.");
        }
        else if(spycnt == 5) {
            System.out.println("ВСЕ ОНИ ИМПОСТЕРы.");
        }
		 for (Object peoples : people) {
	            System.out.println(peoples);
	        }
	}
	
}
