
public class triangle implements shape {

	private int x1,y1,x2,y2,x3,y3;
	//private double length1; //x1,y1 -> x2,y2
	//private double length2; //x2,y2 -> x3,y3
	//private double length3; //x3,y3 -> x1,y1
	
	public triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		//length1 = compute_length(x1,y1,x2,y2);
	}
	
	private double compute_length(int x1,int y1,int x2,int y2){
		return 0;
	}
	
	@Override
	public double compute_area() {
		return 0;
	}

	@Override
	public int compute_center_mass() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void scale(int factor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(int num_degrees) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
