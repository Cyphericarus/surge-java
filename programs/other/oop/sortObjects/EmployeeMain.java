// compare the Employee objects using employee name
package other.oop.sortObjects;

import java.util.Arrays;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee that) {
        return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return "Employee [id: " + id + ", name: " + name + "]";
    }
}

public class EmployeeMain {
    public static void main (String [] args) {
        Employee [] employees = new Employee[4];

        employees[0] = new Employee(101, "Raju");
        employees[1] = new Employee(102, "Svetlana");
        employees[2] = new Employee(103, "Viktor");
        employees[3] = new Employee(104, "Iveta");

        System.out.println("Employees array before sorting: ");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println();
        System.out.println("Employees array after sorting: ");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
