package Day13.Lab.prob4;

public interface QuackBehavior {
	public default void quack() {
	   System.out.println("    Quacking");
	}

}
