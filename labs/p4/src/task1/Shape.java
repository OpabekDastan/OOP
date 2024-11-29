package task1;
enum Color{
	red,blue,purple;
}

public abstract class Shape {
	private int position;
	private Color color;
	public Shape(int position, Color color) {
		this.color = color;
		this.position = position;
	}
	public int getPos() {
		return position;
	}
	public Color getColor() {
		return color;
	}
	public abstract void draw();
	
	
}
