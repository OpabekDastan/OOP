package task1;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		HashSet<Shape> shapes = new HashSet<>();
		
		Rectangle rec1 = new Rectangle(4, Color.blue, 5, 6);
		Triangle tr1 = new Triangle(4, Color.red, 5);
		Circle c1 = new Circle(4,Color.purple, 6);
		
		
		shapes.add(rec1);
		shapes.add(tr1);
		shapes.add(c1);
		
		for(Shape shape : shapes) {
			shape.draw();
		}
		System.out.println();
		
		
	}
}
