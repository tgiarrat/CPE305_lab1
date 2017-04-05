
public class CircleModfier implements ShapeModifier{
	
	public void scale(Shape circle, int factor) {
		((Circle) circle).setRadius(((Circle) circle).getRadius() * factor);
	}
	
	public void rotate() {
		
	}


	
}
