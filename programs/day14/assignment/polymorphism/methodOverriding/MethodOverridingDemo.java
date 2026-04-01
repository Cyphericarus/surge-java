package day14.assignment.polymorphism.methodOverriding;

class Payment {
    public void makePayment() {
        System.out.println("Pay the amount");
    }
}

class Cash extends Payment {
    public void makePayment() {
        System.out.println("Pay in Cash");
    }
}

class UPI extends Payment {
    public void makePayment() {
        System.out.println("Pay with UPI");
    }
}

class Card  extends Payment {
    public void makePayment() {
        System.out.println("Pay with Card");
    }
}

class ProcessPayment {
    public static void paymentDone(Payment p) {
        Payment obj = p;
        obj.makePayment();
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Payment p1 = new Cash();
        Payment p2 = new UPI();
        Payment p3 = new Card();

        ProcessPayment.paymentDone(p1);
        ProcessPayment.paymentDone(p2);
        ProcessPayment.paymentDone(p3);
    }
}
