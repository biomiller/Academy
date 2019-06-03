import java.util.concurrent.TimeUnit;

public class Car implements Cloneable {
	private int topSpeed;
	private int bhp;
	private String name;
	private int doors;
	private String colour;

	public Car(int topSpeed, int bhp, String name, int doors) throws InterruptedException {
		super();
		System.out.println("Building a car...");
		TimeUnit.SECONDS.sleep(10);// takes 15 seconds to design new car
		this.topSpeed = topSpeed;
		this.bhp = bhp;
		this.name = name;
		this.doors = doors;
		this.colour = null;
		System.out.println("Built a car!");

	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
			return (Car) super.clone();
	}
	
	
	

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getBhp() {
		return bhp;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColour() {
		return colour;
	}

	public void paintCar(String colour) {
		this.colour = colour;
	}


}