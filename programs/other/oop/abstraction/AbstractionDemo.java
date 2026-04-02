package other.oop.abstraction;

interface Vehicle {
    void drive();
}

abstract class Car implements Vehicle {
    public abstract void playMusic();
}

class Benz extends Car {
    public void drive() {
        System.out.println("Driving -- Benz");
    }

    public void playMusic() {
        System.out.println("Playing music -- Benz");
    }
}

class Audi extends Car {
    public void drive() {
        System.out.println("Driving -- Audi");
    }

    public void playMusic() {
        System.out.println("Playing music -- Audi");
    }
}

class Drive {
    public static void driveCar(Car c) {
        c.drive();
    }
}

class PlayMusicInCar {
    public static void playMusic(Car c) {
        c.playMusic();
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Car benz = new Benz();
        Car audi = new Audi();

        Drive.driveCar(audi);
        Drive.driveCar(benz);
        
        PlayMusicInCar.playMusic(audi);
        PlayMusicInCar.playMusic(benz);
    }
}
