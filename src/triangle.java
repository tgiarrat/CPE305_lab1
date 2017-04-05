import java.awt.Point;

public class triangle extends shape {

	Point p1, p2, p3;
	//private int x1,y1,x2,y2,x3,y3;
	//private double length1; //x1,y1 -> x2,y2
	//private double length2; //x2,y2 -> x3,y3
	//private double length3; //x3,y3 -> x1,y1
	
	public triangle(Point p1, Point p2, Point p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		//length1 = compute_length(x1,y1,x2,y2);
	}
	
	private double compute_length(int x1,int y1,int x2,int y2){
		double a = Math.abs(x2-x1);
		double b = Math.abs(y2-y1);
		return Math.sqrt(((a * a) + (b * b)));
	}
	

}
