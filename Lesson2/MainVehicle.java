import java.util.ArrayList;

class Vehicle {
    private double mile;
    private int year;
    private ArrayList<String> serviceHistory = new ArrayList<>();

    public Vehicle(double mile, int year) {
        this.mile = mile;
        this.year = year;
    }

    public Vehicle() {}

    public double estimatedValue() {
        double Value = 3000;
        int currentYear = 2025;
        int age = currentYear - year;
        return Value - (age * 1000 + mile * 0.1);
    }

    public void addServiceRecord(String record) {
        serviceHistory.add(record);
    }

    public void displayHistory() {
        for (String record : serviceHistory) {
            System.out.println(record);
        }
    }
}

class Car extends Vehicle {
    private double distance;
    private double fuel;

    public Car(double distance, double fuel) {
        super(); 
        this.distance = distance;
        this.fuel = fuel;
    }

    public double fuelEfficiency() {
        if (fuel == 0) return 0; 
        return distance / fuel;
    }
}

class Truck extends Vehicle {
    private double maxWeight;

    public Truck(double maxWeight) {
        super();
        this.maxWeight = maxWeight;
    }

    public boolean canDo(double weight) {
        return weight <= maxWeight;
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Car car1 = new Car(200, 10);
        Truck truck1 = new Truck(12);

        Vehicle vehicle1 = new Vehicle(1400, 2006);
        System.out.println("Estimated value: " + vehicle1.estimatedValue());

        vehicle1.addServiceRecord("Tos soligdson");
        vehicle1.addServiceRecord("Dugui soligdson");

        System.out.println("Service history:");
        vehicle1.displayHistory();

        System.out.println("Fuel efficiency: " + car1.fuelEfficiency());
        System.out.println("14 tonn daah? " + truck1.canDo(14));
    }
}