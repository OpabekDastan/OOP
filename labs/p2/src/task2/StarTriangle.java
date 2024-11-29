package task2;

public class StarTriangle {
	private int width;

public StarTriangle(int width) {
	this.width = width;
}
public String toString() {
	StringBuilder triangle = new StringBuilder();
	for(int i = 1; i<=width; i++) {
		for(int j = 1; j<=i; j++) {
			triangle.append("[*]");
		}
		triangle.append("\n");
	}
	return triangle.toString();
}

}