package other.oop;

class Outer {
    int variable;

    public void showOuter() {
        System.out.println("Inside outer show..");
    }

    class Inner {
        public void showInner() {
            System.out.println("Inside inner show..");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showOuter();

        Outer.Inner inner = outer.new Inner();
        inner.showInner();
    }
}
