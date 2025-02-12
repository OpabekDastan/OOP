package task1;

public class Rectangle extends Shape{
	private int width;
	private int height;
	public Rectangle(int position, Color color, int width, int height) {
		super(position, color);
		this.width = width;
		this.height = height;
	}
	@Override
	public Color getColor() {
		return super.getColor();
	}
	@Override
	public void draw() {
		System.out.println("Draw RecT at the pos:" + super.getPos() + "\n" + "with color:" + getColor() + "\n" + "height and width:" + height +" "+ width + "\n");
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				System.out.print("[*]");
			}
			System.out.println();
		}
	}
}
