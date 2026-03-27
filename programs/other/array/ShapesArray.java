package other.array;

abstract class Shape {
    public abstract double area();
}

class Square extends Shape {
    private int side;

    Square(int side) {
        super();
        this.side = side;
    }

    public double area() {
        return Math.pow(side, 2);
    }
}

class Circle extends Shape {
    final static double PI = 3.14;
    private double radius;

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private int length, breadth;

    Rectangle(int length, int breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

public class ShapesArray {
    public static void main(String [] args) {
        
    }
}
