package Spy;

public class SpyDetector{
public static boolean isPowerOfTwo(int number) {
    if (number <= 0) {
        return false;
    }

    while (number > 1 && number % 2 == 0) {
        number /= 2;
    }
    
    return number == 1;
}

	
	
}
