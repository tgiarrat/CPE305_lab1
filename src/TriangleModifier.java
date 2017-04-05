import java.awt.Point;

public class TriangleModifier implements ShapeModifier {

	@Override
	public void scale(Shape shape, int factor) {
		Triangle tri = (Triangle) shape;
		tri.setP1(new Point((int)tri.getP1().getX() * factor, (int)tri.getP1().getY() * factor));
		tri.setP2(new Point((int)tri.getP2().getX() * factor, (int)tri.getP2().getY() * factor));
		tri.setP3(new Point((int)tri.getP3().getX() * factor, (int)tri.getP3().getY() * factor));
		
	}

	@Override
	public void rotate(int degrees) {
		System.out.println("Rotated triangle by " + degrees + " degrees.");
	}

}
