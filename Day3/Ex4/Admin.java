package Day3.Ex4;

import java.util.LinkedList;
import java.util.List;

public class Admin {

	public static void main(String[] args) {
		List<Property> props = new LinkedList<Property>();
		
		props.add(new House(101, "Carlos Hernandez", "Medellin", "Address 111", 10000));
		props.add(new Condo(102, "Carlos Hernandez", "Fairfield", "Address 222", 2));
		props.add(new Trailer(103, "Carlos Hernandez", "Fairfield", "Address 333", "Utopia"));
		System.out.println(props);
		System.out.printf("Total rent for all properties: %.2f\n",computeTotalRent(props));
		System.out.printf("Total rent for properties in Medellin: %.2f\n",computeTotalRentxCity(props,"Medellin"));
		System.out.printf("Total rent for properties in Fairfield: %.2f\n",computeTotalRentxCity(props,"Fairfield"));
	}
	
	public static double computeTotalRent(List<Property> props) {
		double totalRent=0;
		
		for (Property p:props) {
			totalRent += p.computeRent();
		}
		return totalRent;
	}

	public static double computeTotalRentxCity(List<Property> props, String city) {
		double totalRent=0;
		
		for (Property p:props) {
			if (city.equals(p.getCity()))
				totalRent += p.computeRent();
		}
		return totalRent;
	}
}
