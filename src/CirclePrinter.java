
public class CirclePrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Circle rect = (Circle)shape;
		System.out.println("Circle");
	}

}
