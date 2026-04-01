package day14.assignment.accessModifiers.package1;

class AccessModifiersClass1 {
    int age = 25;
    protected static String name = "Hiero";
    private double balance = 5900;
    public boolean isGreek = true;

    protected double getBalance() {
        return balance;
    }
}

public class AccessModifiersDemo extends AccessModifiersClass1 {

    public static String getName() {
        return name;
    }

    // public double getBalance() { // will get error as balance is private
    // return balance;
    // }

    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        AccessModifiersDemo amc2 = new AccessModifiersDemo();
        System.out.println(AccessModifiersDemo.getName());
        System.out.println(amc2.getBalance());

    }
}
