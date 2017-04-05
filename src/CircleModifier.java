
public class CircleModifier implements ShapeModifier{
	
	public void scale(Shape shape, int factor) {
		Circle circ = (Circle) shape;
		circ.setRadius(circ.getRadius() * factor);
	}
	
	public void rotate(int degrees) {
		System.out.println("Rotated circle by " + degrees + " degrees.");
	}
}
