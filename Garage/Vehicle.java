
public abstract class Vehicle {
	
    private int id;
    private static int idCounter = 1;
	
	private double weight;
	private int seats; 
	private int topSpeed;
	private String colour;
	private int engines;
	

	public Vehicle(double weight, int seats, int topSpeed, String colour, int engines) {
		this.weight = weight;
		this. seats = seats;
		this.topSpeed = topSpeed;
		this.colour = colour;
		this.engines = engines;
		this.id = idCounter++;
		
	}



	public void move() {
		System.out.println("Moving...");
	}
	
	public void refuel() {
		System.out.println("Refuelling...");
	}
	
	
	
	public double getCost() {
		double cost = (this.seats * 100) + (this.engines * 500); 
		return cost;
	}
	
	
	
	
	
	
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	

	public int getEngines() {
		return engines;
	}


	public void setEngines(int engines) {
		this.engines = engines;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	
	

}
