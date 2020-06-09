package inheritanceTest;

public class Bike extends Vehicle{
	private String bikeType;
	
	public Bike(int numWheels, String bikeType) {
		super(numWheels);
		this.bikeType = bikeType;
	}
	
	public String getBikeType() {
		return bikeType;
	}
}
