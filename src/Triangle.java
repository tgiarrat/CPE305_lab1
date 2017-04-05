import java.awt.Point;

public class Triangle extends Shape {

	private Point p1, p2, p3;
	
	public Triangle(Point p1, Point p2, Point p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		
		setShapePrinter(new TrianglePrinter());
		setShapeModifier(new TriangleModifier());
	}
	
	@Override
	public double calculateArea() {
		return .5f * (p1.x * p2.y + p2.x * p3.y + p3.x * p1.y - p1.x * p3.y - p3.x * p2.y - p2.x * p1.y);
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}
}
