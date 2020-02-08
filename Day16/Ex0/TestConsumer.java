package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		Consumer<Integer> consum = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i*10);
			}
		};
		lista.add(1);
		lista.add(5);
		lista.add(15);
		lista.add(20);
		lista.add(25);
		
		System.out.println("-----------using new forEach method--------------");
		lista.forEach(consum);
	}

}
