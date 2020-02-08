package Day3.Ex3A;

public class Circle extends Cylinder {

	public static void main(String[] args) {
		//Not practical implementation of inheritance, only one data-member in common
		//and we cannot to override the method to compute area/volume (different 
		//concepts because one is a 2-dimension object and the other one is a 3-dimension 
		//object. We cannot use polymorphism here to call a common method.
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10.2);
		Cylinder cy1 = new Cylinder(5,5);
		Cylinder cy2 = new Circle(3);
		
		Cylinder[] arrCyls = new Cylinder[4];
		arrCyls[0] = c1;
		arrCyls[1] = c2;
		arrCyls[2] = cy1;
		arrCyls[3] = cy2;  	
		
		System.out.printf("Object of type %s the call to the method: %f\n",arrCyls[0].getClass().getName(),((Circle) arrCyls[0]).computeArea());
		System.out.printf("Object of type %s the call to the method: %f\n",arrCyls[2].getClass().getName(),arrCyls[2].computeVolume());

	}
	
	Circle(double r){
		radius=r;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}

}
