package other.oop.objectArray;

public class ObjectArrayDemo1 {
    public static void main(String [] args) {
        Object [] arr = new Object[5];

        arr[0] = 20;
        arr[1] = "Hello, mom!";
        arr[2] = 45.6F;
        arr[3] = true;
        arr[4] = new Customer();

        for(Object obj: arr) {
            System.out.println(obj);
        }
    }
}

class Customer {
    public String toString() {
        return "Customer []";
    }
}