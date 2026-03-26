//  WAP to create Customer array to hold multiple customer Object(Manual insertion)

package other.array;

class Customer {
    int id;
    String name;
    double bill;

    Customer(int id, String name, double bill) {
        this.id = id;
        this.name = name;
        this.bill = bill;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
    }
}

public class CustomerMain {
    public static void main(String[] args) {
        Customer [] customers = new Customer[3];

        customers[0] = new Customer(101, "Hari", 20000);
        customers[1] = new Customer(103, "Teja", 16700);
        customers[2] = new Customer(102, "Vamsi", 21765);

        for (Customer customer: customers) {
            System.out.println(customer.toString());
        }
    }
}
