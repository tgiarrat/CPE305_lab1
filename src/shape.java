
public interface shape {

	int compute_area();
	
	int compute_center_mass();
	
	void scale(int factor);
	
	void rotate(int num_degrees);
	
	void print();
	
}