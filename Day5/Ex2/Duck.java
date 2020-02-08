package Day5.Ex2;

public abstract class Duck{
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public void fly() {
		flyBehavior.fly();
	}
	public void swim() {
		System.out.println("Swiming");
	}
	public abstract void display();
}
