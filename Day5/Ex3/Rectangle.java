package Day5.Ex3;

public final class Rectangle implements Shape{
	private final double width;
	public final double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	private double length;
	
	public Rectangle(double w, double l){
		width = w;
		length = l;
	}
    public double computeArea() {
		return width*length;
	}

}
