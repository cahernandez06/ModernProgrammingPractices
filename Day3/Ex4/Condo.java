package Day3.Ex4;

public class Condo extends Property{
	private int numFloors;
	
	public Condo(int propertyId, String owner, String city, String address, int numFloors) {
		super(propertyId, owner, city, address);
		this.numFloors = numFloors;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public double computeRent() {
		return 400*getNumFloors();
	}
}
