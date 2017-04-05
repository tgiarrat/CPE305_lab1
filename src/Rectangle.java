import java.awt.Point;

public class Rectangle extends Shape {
	private Point lowerLeft;
	private double width, height;
	
	public Rectangle(Point lowerLeft, double width, double height){ 
		this.lowerLeft = lowerLeft;
		this.width = width;
		this.height = height;
		setShapePrinter(new RectPrinter());
		setShapeModifier(new RectModifier());
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	
	public Point getLowerLeftPoint() {
		return lowerLeft;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
}
