
public class TrianglePrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Triangle tri = (Triangle) shape;
		System.out.println("Triangle:");
		System.out.println("\tp1: " + tri.getP1());
		System.out.println("\tp2: " + tri.getP2());
		System.out.println("\tp3: " + tri.getP3());
		System.out.println("\tarea: " + tri.calculateArea());
		System.out.println("\tcenter of mass: " + tri.getCenterOfMass());
	}

}
