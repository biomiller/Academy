
public class Runner {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		Car protoCar = new Car(100, 50, "Fast Car", 3);
		
		System.out.println("Cloning a car...");
		
		Car car1 = (Car) protoCar.clone();
		
		System.out.println("Cloned car1!");
		
		System.out.println(protoCar.getName());

		
		System.out.println(car1.getName());

		

	}

}
