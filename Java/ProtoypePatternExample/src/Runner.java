
public class Runner {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		Car car1 = new Car(100, 50, "Fast Car", 3);
		
		System.out.println("Cloning a car...");
		
		Car car2 = (Car) car1.clone();
		
		System.out.println("Cloned car1!");
		
		System.out.println(car1.getName());

		
		System.out.println(car2.getName());

		

	}

}
