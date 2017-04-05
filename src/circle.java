

public class circle implements shape {

	private int radius, x, y;
	
	public circle(int x, int y, int radius) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double compute_area() {
		return Math.PI * radius *radius;
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
