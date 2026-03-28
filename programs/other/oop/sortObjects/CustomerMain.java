// compare the Customer objects using customer id
package other.oop.sortObjects;

import java.util.Arrays;

class Customer implements Comparable<Customer> {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [id: " + id + ", name: " + name + "]";
    }

    @Override
    public int compareTo(Customer that) {
        return this.id - that.id;
    }
}

public class CustomerMain {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];

        customers[0] = new Customer(101, "Raju");
        customers[1] = new Customer(103, "Viktor");
        customers[2] = new Customer(104, "Iveta");
        customers[3] = new Customer(102, "Svetlana");

        System.out.println("Customers array before sorting: ");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Arrays.sort(customers);

        System.out.println();
        System.out.println("Customers array after sorting: ");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
