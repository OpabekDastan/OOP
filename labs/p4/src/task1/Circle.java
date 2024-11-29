package task1;

public class Circle extends Shape{
	private int radius;
	public Circle(int position, Color color, int radius ) {
		super(position, color);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Draw Circle	 at the pos:" + super.getPos() + "\n" + "with color:" + super.getColor() + "\n" +"and radius:" + radius + "\n");
		
		for(int i = -radius; i<= radius; i++) {
			for(int j = -radius; j<= radius; j++) {     //x^2 + y^2 = r^2
				if(Math.abs(i*i + j*j - radius*radius)<radius) {
					System.out.print("[*]");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
