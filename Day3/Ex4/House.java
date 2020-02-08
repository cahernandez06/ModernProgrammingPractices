package Day3.Ex4;

public class House extends Property{
	private double lotSize;
	
	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}

	public House(int propertyId, String owner, String city, String address, double lotSize) {
		super(propertyId, owner, city, address);
		this.lotSize=lotSize;
	}
	
	public double computeRent() {
		return 0.1*getLotSize();
	}

}
