package other.oop.interfaces.functionalInterfaces;

@FunctionalInterface  // should have only one method in interface
interface Demo {
    void show();
}

// class ImplementedDemo implements Demo {
//     public void show() {
//         System.out.println("inside the ImplementedDemo's show()");
//     }
// }

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        // ImplementedDemo obj = new ImplementedDemo();
        // obj.show();

        Demo obj = () -> {
            System.out.println("inside the show of anonymous class");
        };
        obj.show();
    }
}
