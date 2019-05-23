
public class Animal {
	
	private int weight;
	private int age;
	private int height;
	
	public Animal(int weight, int height, int age ) {
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getHeight() {
		return this.height;
	}
	

	public void eat() {
		System.out.println("On nom nom!");
	}
	
	public void reproduce() {
		System.out.println("Making a baby...");
	}

}
