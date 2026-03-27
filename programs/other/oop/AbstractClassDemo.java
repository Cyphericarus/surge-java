package other.oop;

abstract class Car {
    public abstract void fly();
    public abstract void transform();

    public void drive() {
        System.out.println("Driving..");
    }
}

class LandRover extends Car {
    public void fly() {
        System.out.println("flying..");
    }

    public void transform() {
        System.out.println("transforming..");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Car obj = new LandRover();
        obj.fly();
        obj.transform();
        obj.drive();
    }
}