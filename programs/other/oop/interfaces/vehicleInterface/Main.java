package other.oop.interfaces.vehicleInterface;

interface Vehicle {
    void drive();
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Driving the bike..");
    }
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving the car..");
    }
}

class DriveVehicle {
    public void driveVehicle(Vehicle vehicle) {       // loosely coupled
        vehicle.drive();
    }
}

public class Main {
    public static void main(String [] args) {
        Vehicle bike = new Bike();              // dynamic polymorphism
        Vehicle car = new Car();                // dynamic polymorphism

        DriveVehicle driveVehicle = new DriveVehicle();
        driveVehicle.driveVehicle(car);
        driveVehicle.driveVehicle(bike);
    }
}
