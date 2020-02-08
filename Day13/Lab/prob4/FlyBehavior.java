package Day13.Lab.prob4;

public interface FlyBehavior {
	public default void fly() {
	   System.out.println("    Fly with wings");
	};
}
