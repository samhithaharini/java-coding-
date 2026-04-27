import java.util.Scanner;

class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void display() {
        super.display();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    private String type;

    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Car make:");
        String carMake = scanner.nextLine();

        System.out.println("Enter Car model:");
        String carModel = scanner.nextLine();

        System.out.println("Enter number of doors:");
        int numberOfDoors = Integer.parseInt(scanner.nextLine());

        Car car = new Car(carMake, carModel, numberOfDoors);

        System.out.println("Enter Bike make:");
        String bikeMake = scanner.nextLine();

        System.out.println("Enter Bike model:");
        String bikeModel = scanner.nextLine();

        System.out.println("Enter Bike type (e.g., Sport, Cruiser):");
        String bikeType = scanner.nextLine();

        Bike bike = new Bike(bikeMake, bikeModel, bikeType);

        System.out.println("\nCar Details:");
        car.display();

        System.out.println("\nBike Details:");
        bike.display();
    }
}