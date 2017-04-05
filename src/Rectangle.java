import java.awt.Point;

public class Rectangle extends Shape {
	private double width, height;
	private Point p1;
	private Point p2;
	
	public Rectangle(Point p1, Point p2, int width, int height){ 
		this.p1 = p1;
		this.p2 = p2;
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public Point getPoint1() {
		return p1;
	}

	public Point getPoint2() {
		return p2;
	}
}
