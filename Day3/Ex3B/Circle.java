package Day3.Ex3B;

public class Circle {
	
	private Cylinder cil;

	public static void main(String[] args) {
		//
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10.2);
		Cylinder cy1 = new Cylinder(5,5);
		
		Cylinder[] arrCyls = new Cylinder[4];
		
		System.out.printf("Object of type %s the call to the method: %f\n",c1.getClass().getName(),c1.computeArea());
		System.out.printf("Object of type %s the call to the method: %f\n",cy1.getClass().getName(),cy1.computeVolume());

	}
	
	Circle(double r){
		cil = new Cylinder(r,0);
	}
	
	public double computeArea() {
		double rad = cil.getRadius();
		return Math.PI*rad*rad;
	}

}
