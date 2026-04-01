package day14.assignment.accessModifiers.package2;

import day14.assignment.accessModifiers.package1.AccessModifiersDemo;

class AMC1 extends AccessModifiersDemo {

    // public void printAge() {
    //     System.out.println(getAge()); // wont work as getName() is default
    // }

    public void printBalance() {
        System.out.println(getBalance());  // will work as we extended the class and method is protected
    }

    public boolean isGreek() {  // will work as the variable is public
        return isGreek;
    }
}

public class AMDemo extends AMC1 {
    public static void main(String[] args) {
        AMC1 obj = new AMC1();

        System.out.println(getName());
        System.out.println(obj.isGreek());
    }
}
