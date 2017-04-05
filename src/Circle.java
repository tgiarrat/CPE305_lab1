
import java.awt.Point;

public class Circle extends Shape {
	private double radius;
	private Point center;
	
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
		setShapePrinter(new CirclePrinter());
		setShapeModifier(new CircleModifier());
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
