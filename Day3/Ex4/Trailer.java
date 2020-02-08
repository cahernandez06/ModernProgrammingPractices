package Day3.Ex4;

public class Trailer extends Property{
	private String park;
	
	public Trailer(int propertyId, String owner, String city, String address, String Park)  {
		super(propertyId, owner, city, address);
		this.park=Park;
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public double computeRent() {
		return 500;
	}
}
