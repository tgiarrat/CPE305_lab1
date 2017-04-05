
public class RectPrinter implements ShapePrinter {

	@Override
	public void print(Shape shape) {
		Rectangle rect = (Rectangle)shape;
		System.out.println("Rectangle");
	}

}
