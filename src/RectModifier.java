
public class RectModifier implements ShapeModifier {

	@Override
	public void scale(Shape shape, int factor) {
		Rectangle rect = (Rectangle) shape;
		
		rect.setWidth(rect.getWidth() * factor);
		rect.setHeight(rect.getHeight() * factor);
	}

	@Override
	public void rotate(int degrees) {
		System.out.println("Rotated rectangle by " + degrees + " degrees.");
	}
}
