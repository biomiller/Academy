
public class Plane extends Vehicle {
	
	private double wingspan;
	private int propellers;
	
	public Plane(double weight, int seats, int topSpeed, String colour, int engines, double wingspan, int propellers) {
		super(weight, seats, topSpeed, colour, engines);
		this.wingspan = wingspan;
		this.propellers = propellers;
	}
	
	
	
	@Override
	public double getCost() {
		double cost = super.getCost() + (this.propellers * 900); 
		return cost;
	}

	public int getPropellers() {
		return propellers;
	}

	public void setPropellers(int propellers) {
		this.propellers = propellers;
	}

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}
	
	

}
