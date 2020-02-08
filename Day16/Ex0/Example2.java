package Day16;

@FunctionalInterface
public interface myIface {
	public double produce();
}

class myRandGen implements myIface{
	
	//public double produce() {
		//return Math.random();
	//}
	public static void main(String[] args) {
		//myIface mrg = new myRandGen();
		//System.out.println(mrg.produce());
		System.out.println(() -> { Random r = new Random(); return r.nextDouble();});
	}
}
