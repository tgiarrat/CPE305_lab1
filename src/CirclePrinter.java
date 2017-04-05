
public class CirclePrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Circle circ = (Circle)shape;
		System.out.println("Circle center: " + circ.getCenter() + " radius: " + circ.getRadius());
	}

}
