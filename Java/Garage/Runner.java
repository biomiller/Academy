
public class Runner {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(3500, 4, 100, "Red", 1, true, 5);
		Car car2 = new Car(3400, 4, 100, "Yellow", 1, true, 5);
		
		Boat boat1 = new Boat(2500, 2, 90, "White", 2, 0, false);
		Boat boat2 = new Boat(1000, 2, 10, "White", 0, 2, true);
		
		Plane plane1 = new Plane(9000, 2, 200, "Blue", 1, 3.5, 1);
		Plane plane2 = new Plane(9200, 2, 250, "Red", 2, 4, 2);

		
		Garage garage1 = new Garage();
		
		garage1.addVehicle(car1);
		garage1.addVehicle(car2);
		garage1.addVehicle(boat1);
		garage1.addVehicle(boat2);
		garage1.addVehicle(plane1);
		garage1.addVehicle(plane2);
	
		System.out.println(car1.getId());
		System.out.println(plane2.getId());

		
		System.out.println(garage1.searchType("Car"));
		
		System.out.println(garage1.getNumVehicles());
		
		garage1.removeVehicleById(6);
		
		System.out.println(garage1.getNumVehicles());
		
		
		System.out.println(garage1.getNumVehicles());
		
		System.out.println(car1.getCost());
		System.out.println(plane1.getCost());
		
		
		garage1.calcTotalCost();
		
		garage1.removeVehicleByType("Car");
		
		garage1.calcTotalCost();


		



		
		

		
	}

}
