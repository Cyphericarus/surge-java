package other.oop.interfaces.functionalInterfaces;

@FunctionalInterface
interface Add {
    int add(int a, int b);
}

public class Demo2 {
    public static void main(String[] args) {
        Add obj = (a, b) -> a+b;
        System.out.println(obj.add(30, 20));
    }
}
