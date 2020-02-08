package Day5.Ex3;

public final class Circle implements Shape{
	private final double radius;
	
	public double getRadius() {
		return radius;
	}

	public Circle(double r){
		radius=r;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}

}
