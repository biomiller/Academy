
public class Bird extends Animal {

	private int wingspan;
	private int beakLength;
	private String sex;
	
	public Bird(int weight, int height, int age, int wingspan, int beakLength, String sex) {
		super(weight, height, age);
		this.wingspan = wingspan;
		this.beakLength= beakLength;
		this.sex = sex;
			}
	
	public int getBeakLength() {
		return beakLength;
	}

	public void setBeakLength(int beakLength) {
		this.beakLength = beakLength;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}
	
	
	public void layEgg() {
		System.out.println("Laying an egg...");
	}
	
	
	public String toString() {
		return("Weight: " + getWeight() + "\n" + "Height: " + getHeight() + "\n" + "Age: " + getAge() + "\n" + "Wingspan: " + getWingspan() + "\n" +  "Beak length: " + getBeakLength() + "\n" + "Sex: " + getSex() );
	}
}
