
public class CirclePrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Circle circ = (Circle)shape;
		System.out.println("Circle:");
		System.out.println("\tcenter: " + circ.getCenter());
		System.out.println("\tradius: " + circ.getRadius());
		System.out.println("\tarea: " + circ.calculateArea());
		System.out.println("\tcenter of mass: " + circ.getCenterOfMass());
	}

}
