
public class Boat extends Vehicle {
	
	private int oars;
	private boolean sails;
	
	public Boat(double weight, int seats, int topSpeed, String colour, int engines, int oars, boolean sails) {
		super(weight, seats, topSpeed, colour,engines);
		this.oars = oars;
		this.sails = sails;
		
	}
	
	
	@Override
	public double getCost() {
		double cost = super.getCost() + (this.oars * 40); 
		return cost;
	}
	

	public int getOars() {
		return oars;
	}
	

	public void setOars(int oars) {
		this.oars = oars;
	}

	public boolean isSails() {
		return sails;
	}

	public void setSails(boolean sails) {
		this.sails = sails;
	}
	
	
	
	
}
