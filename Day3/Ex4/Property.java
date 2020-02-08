package Day3.Ex4;

public abstract class Property {

	private String address;
	private int propertyId;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	private String city;
	private String owner;
	
	public Property(int propertyId, String owner, String city, String address) {
		this.propertyId=propertyId;
		this.owner=owner;
		this.city=city;
		this.address=address;
	}
	public String getCity() {
		return city;
	}
	public String getOwner() {
		return owner;
	}
	@Override
	public String toString() {
		return "Property with ID "+getPropertyId()+" located in "+getAddress()+" city "+getCity()+" and owner "+getOwner()+"\n";
	}
	public abstract double computeRent();

}
