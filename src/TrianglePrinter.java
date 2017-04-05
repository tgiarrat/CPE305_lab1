
public class TrianglePrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Triangle tri = (Triangle) shape;
		System.out.println("Triangle p1: " + tri.getP1()  + " p2: " + tri.getP2() + " p3: " + tri.getP3());
	}

}
