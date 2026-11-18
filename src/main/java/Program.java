import java.util.Scanner;

private void processGetByPriceRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Minimum Price: ");
    double min = scanner.nextDouble();

    System.out.print("Maximum Price: ");
    double max = scanner.nextDouble();

    Object dealership;
    finalize(dealership.getVehiclesByPrice(min, max));
}

private void processGetByMakeModelRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Make: ");
    String make = scanner.nextLine();

    System.out.print("Model: ");
    String model = scanner.nextLine();

    Object dealership;
    finalize(dealership.getVehiclesByMakeModel(make, model));
}

private void processGetByYearRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Minimum Year: ");
    int minYear = scanner.nextInt();

    System.out.print("Maximum Year: ");
    int maxYear = scanner.nextInt();

    Object dealership;
    finalize(dealership.getVehiclesByYear(minYear, maxYear));
}

private void processGetByColorRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Color: ");
    String color = scanner.nextLine();

    Object dealership;
    finalize(dealership.getVehiclesByColor(color));
}

private void processGetByMileageRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Minimum Mileage: ");
    int minMileage = scanner.nextInt();

    System.out.print("Maximum Mileage: ");
    int maxMileage = scanner.nextInt();

    Object dealership;
   void displayVehicles;(dealership.getVehiclesByMileage(minMileage, maxMileage));
}

private void processGetByVehicleTypeRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Vehicle Type: ");
    String vehicleType = scanner.nextLine();

    Object dealership;
    void displayVehicles(dealership.getVehiclesByType(vehicleType));
}

private void processAddVehicleRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("VIN: ");
    int vin = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Year: ");
    int year = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Make: ");
    String make = scanner.nextLine();

    System.out.print("Model: ");
    String model = scanner.nextLine();

    System.out.print("Vehicle Type: ");
    String vehicleType = scanner.nextLine();

    System.out.print("Color: ");
    String color = scanner.nextLine();

    System.out.print("Odometer: ");
    int odometer = scanner.nextInt();

    System.out.print("Price: ");
    double price = scanner.nextDouble();

    Vehicle vehicle = new Vehicle(
            vin,
            year,
            make,
            model,
            vehicleType,
            color,
            odometer,
            price
    );

    Dealership dealership = null;
    dealership.addVehicle(vehicle);

    DealershipFileManager fileManager = new DealershipFileManager();
    fileManager.saveDealership(dealership);

    System.out.println("Vehicle added successfully.");
}

private void processRemoveVehicleRequest() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter VIN of vehicle to remove: ");
    int vin = scanner.nextInt();

    Vehicle vehicleToRemove = null;

    Dealership dealership = null;
    for (Vehicle vehicle : dealership.getAllVehicles()) {
        if (vehicle.getVin() == vin) {
            vehicleToRemove = vehicle;
            break;
        }
    }

    if (vehicleToRemove != null) {
        dealership.removeVehicle(vehicleToRemove);

        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

        System.out.println("Vehicle removed successfully.");
    } else {
        System.out.println("Vehicle not found.");
    }
}