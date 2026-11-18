import java.util.ArrayList;

public class dealership {
    public dealership(String name, String address, String phone) {

    }

    public void addVehicle(Vehicle vehicle) {

    }

    public ArrayList<Vehicle> getAllVehicles() {
        return null;
    }

    public void removeVehicle(Vehicle vehicleToRemove) {

    }
}

class VehicleManager {

    private ArrayList<Vehicle> vehicles;

    // Constructor
    public VehicleManager() {
        vehicles = new ArrayList<Vehicle>();
    }

    // Add a vehicle to the list
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Return all vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }

    // Search methods - return null for now
    public Vehicle searchByVIN(String vin) {
        return null;
    }

    public Vehicle searchByMake(String make) {
        return null;
    }

    public Vehicle searchByModel(String model) {
        return null;
    }

    // Remove method - empty for now
    public void removeVehicle(Vehicle vehicle) {

    }
}
