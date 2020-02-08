package Day3.Ex3A;

public class Cylinder {
	double radius;
	double height;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	
	public double computeVolume() {
		return Math.PI*radius*radius*height;
	}

}
