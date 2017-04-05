
import java.awt.Point;

public class Circle extends Shape {
	private double radius;
	private Point center;
	
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public Point getCenter() {
		return center;
	}
}
