
public class Car extends Vehicle {

	private int wheels = 4;
	private boolean rightHandDrive;
	private int doors;

	public Car(double weight, int seats, int topSpeed, String colour, int engines, boolean rightHandDrive, int doors) {
		super(weight, seats, topSpeed, colour, engines);
		this.rightHandDrive = rightHandDrive;
		this.doors = doors;
	}
	
	public void openBonnet() {
		System.out.println("Opening bonnet...");
	}
	
	
	
	@Override
	public double getCost() {
		double cost = super.getCost() + (this.wheels * 100) + (this.doors * 300); 
		return cost;
	}


	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public boolean isRightHandDrive() {
		return rightHandDrive;
	}



	public void setRightHandDrive(boolean rightHandDrive) {
		this.rightHandDrive = rightHandDrive;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}




	

}
