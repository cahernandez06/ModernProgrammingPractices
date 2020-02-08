package Day5.Ex3;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Shape> myShapes = new LinkedList<Shape>();
		double sumAreas=0;
		
		myShapes.add(new Circle(5.8));
		myShapes.add(new Rectangle(10,8));
		myShapes.add(new Triangle(2,4));
		
		for (Shape s:myShapes)
			sumAreas += s.computeArea();
		System.out.printf("Sum of all areas: %.2f",sumAreas);
	}

}
