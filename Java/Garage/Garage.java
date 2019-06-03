import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	
	private static ArrayList<Vehicle> vehicleList;

	private Garage() {
		Garage.vehicleList = new ArrayList<Vehicle>();
	}
	
	private static Garage instance;
	
	public static Garage getInstance() {
		if(instance == null) {
			instance = new Garage();
		}
		return instance;
	}

	public static int getNumVehicles() {
		return vehicleList.size();
	}

	public static ArrayList<Vehicle> addVehicle(Vehicle inputVehicle) {
		vehicleList.add(inputVehicle);
		return vehicleList;
	}

	// Remove a vehicle with a particular id from the garage

	public static void removeVehicleById(int id) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getId() == id) {
				vehicleList.remove(i);
			}
		}
	}

	// Remove all vehicles from the garage of a particular type

	public static void removeVehicleByType(String input) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getClass().getCanonicalName() == input) {
				vehicleList.remove(i);
			}
		}
	}

	//

	public static List<Vehicle> searchType(String input) {
		return (vehicleList.stream().filter(v -> v.getClass().getCanonicalName().equals(input))
				.collect(Collectors.toList()));

	}

	public static double calcTotalCost() {

		double total = 0;

		for (Vehicle v : vehicleList) {

			if (v instanceof Car) {

				System.out.println("Car ID: " + v.getId() + " Repair cost: £" + (v.getCost()));

				total += v.getCost();
			}

			else if (v instanceof Boat) {

				System.out.println("Boat ID: " + v.getId() + " Repair cost: £" + (v.getCost()));

				total += v.getCost();

			}

			else if (v instanceof Plane) {

				System.out.println("Plane ID: " + v.getId() + " Repair cost: £" + (v.getCost()));

				total += v.getCost();

			}

		}

		System.out.println("Total cost: £" + total + "\n");

		return total;

	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

}
