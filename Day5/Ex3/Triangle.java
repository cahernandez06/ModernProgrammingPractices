package Day5.Ex3;

public final class Triangle implements Shape{
	private final double base;
	private final double heigth;
	
	public final double getBase() {
		return base;
	}
	public double getHeigth() {
		return heigth;
	}
	
	public Triangle(double b, double h){
		base=b;
		heigth=h;
	}
	public double computeArea() {
		return (base*heigth)/2;
	}

}
