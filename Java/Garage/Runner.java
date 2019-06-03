
public class Runner {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(3500, 4, 100, "Red", 1, true, 5);
		Car car2 = new Car(3400, 4, 100, "Yellow", 1, true, 5);
		
		Boat boat1 = new Boat(2500, 2, 90, "White", 2, 0, false);
		Boat boat2 = new Boat(1000, 2, 10, "White", 0, 2, true);
		
		Plane plane1 = new Plane(9000, 2, 200, "Blue", 1, 3.5, 1);
		Plane plane2 = new Plane(9200, 2, 250, "Red", 2, 4, 2);

		
		Garage.getInstance();

		Garage.addVehicle(car1);
		Garage.addVehicle(car2);
		Garage.addVehicle(boat1);
		Garage.addVehicle(boat2);
		Garage.addVehicle(plane1);
		Garage.addVehicle(plane2);
	
		System.out.println(car1.getId());
		System.out.println(plane2.getId());

		
		System.out.println(Garage.searchType("Car"));
		
		System.out.println(Garage.getNumVehicles());
		
		Garage.removeVehicleById(6);
		
		System.out.println(Garage.getNumVehicles());
		
		
		System.out.println(Garage.getNumVehicles());
		
		System.out.println(car1.getCost());
		System.out.println(plane1.getCost());
		
		
		Garage.calcTotalCost();
		
		Garage.removeVehicleByType("Car");
		
		Garage.calcTotalCost();


		



		
		

		
	}

}
