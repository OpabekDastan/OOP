package task1;

public class Triangle extends Shape {
	private int number;
	public Triangle(int position, Color color, int number) {
		super(position, color);
		this.number = number;
	}
	@Override
	public void draw() {
		System.out.println("Draw Triangle at the pos:" + super.getPos() + "\n" + "with color:" + super.getColor() + "\n" +"number:" + number + "\n");
		
		for(int i = 1; i<=number; i++) {
			for(int j = 0; j <= number - i ; j++) {
				System.out.print("[*]");
			}
			System.out.println();
		}
		
}
}
