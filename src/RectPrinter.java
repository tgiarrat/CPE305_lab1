
public class RectPrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Rectangle rect = (Rectangle)shape;
		System.out.println("Rectangle:");
		System.out.println("\tlower left point: " + rect.getLowerLeftPoint());
		System.out.println("\twidth: " + rect.getWidth());
		System.out.println("\theight: " + rect.getHeight());
		System.out.println("\tarea: " + rect.calculateArea());
		System.out.println("\tcenter of mass: " + rect.getCenterOfMass());
	}

}
