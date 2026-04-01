package day14.assignment.polymorphism.methodOverloading;

public class MethodOverloadingDemo {
    public int sum(int a, int b) {
        return a+b;
    }

    // no of params
    public int sum(int a, int b, int c) {
        return a+b+c;
    }

    public double sum(int a, double b) {
        return a+b;
    }

    // order of params
    public double sum(double a, int b) {
        return a+b;
    }

    // type of params
    public double sum(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(30, 40, 50));
        System.out.println(obj.sum(10, 20.6));
        System.out.println(obj.sum(10.7, 20));
        System.out.println(obj.sum(10.3, 2.10));
    }
}
