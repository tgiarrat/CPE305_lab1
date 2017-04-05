import java.awt.Point;

public class Rectangle extends Shape {
	private Point lowerLeft;
	private int width, height;
	
	public Rectangle(Point lowerLeft, int width, int height){ 
		this.lowerLeft = lowerLeft;
		this.width = width;
		this.height = height;
		setShapePrinter(new RectPrinter());
		setShapeModifier(new RectModifier());
		setCenterOfMass(new Point((int)lowerLeft.getX() + width / 2, (int)lowerLeft.getY() + height / 2));
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	
	public Point getLowerLeftPoint() {
		return lowerLeft;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
