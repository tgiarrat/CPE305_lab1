import java.awt.Point;

public abstract class Shape {
	private Point centerOfMass;
	private ShapePrinter sp;
	private ShapeModifier sm;
	public abstract double calculateArea();
	
	public Point getCenterOfMass() {
		return centerOfMass;
	}
	
	public ShapePrinter getShapePrinter() {
		return sp;
	}

	public ShapeModifier getShapeModifier() {
		return sm;
	}
	
	public void setShapePrinter(ShapePrinter sp) {
		this.sp = sp;
	}

	public void setShapeModifier(ShapeModifier sm) {
		this.sm = sm;
	}

	
}
