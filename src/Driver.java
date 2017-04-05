import java.awt.Point;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * SOLID Design Principles
		 * 
		 * A drawing tool can use the shape primitives circle, rectangle, and triangle. 
		 * For every shape its area and its center of mass are computed. 
		 * Shapes can be scaled, and they can be rotated by an angle. 
		 * A print method generates a text output of the area and the center of mass of every shape on a given canvas.
		 * 
		 * a) instantiate 3 shapes: one circle (center (0,0), radius 5), one rectangle (lower left corner (3,3), width 5, height 8), one triangle (one corner (-2,0), 2nd corner (2,0), 3rd corner (0,4))

		   b) generate text output of the 3 shapes

		   c) scale the circle by 2, rotate the rectangle by 45 degrees, scale the triangle by 3

		   d) generate text output of the 3 modified shapes
		 */
		
		Circle circle = new Circle(new Point(0,0), 5);
		Rectangle rectangle = new Rectangle(new Point(3,3), 5, 8); 
		Triangle triangle = new Triangle(new Point(-2,0),new Point(2,0),new Point(0,4));
		
		System.out.println("Print output:");
		circle.getShapePrinter().print(circle);
		rectangle.getShapePrinter().print(rectangle);
		triangle.getShapePrinter().print(triangle);
		System.out.println();
		
		System.out.println("Modifying shapes...");
		circle.getShapeModifier().scale(circle, 2);
		rectangle.getShapeModifier().rotate(45);
		triangle.getShapeModifier().scale(triangle, 3);
		System.out.println();

		System.out.println("Print output:");
		circle.getShapePrinter().print(circle);
		rectangle.getShapePrinter().print(rectangle);
		triangle.getShapePrinter().print(triangle);
	}

}
