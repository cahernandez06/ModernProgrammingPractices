package Day13.Lab.prob4;

public class RubberDuck extends Duck{
	@Override
	public void fly() {
		System.out.println("    Cannot fly");
	}
	
	@Override
	public void quack() {
		System.out.println("    Squeaking");
	}

}
