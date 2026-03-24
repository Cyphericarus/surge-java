package day5.assignment.constructor;

public class Student {
    String collegeName = "Example College";
    int rollNo;
    String name;

    public Student () {                              // non-parameterized constructor
        System.out.println("This is Non Parameterized Constructor");
        collegeName = "Example College";
    }

    public Student (int rollNo, String name) {      // parameterized constructor
        System.out.println("This is Parameterized Constructor");
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) {
        new Student();
        Student rahul = new Student(101, "Rahul");

        System.out.println("Student Name: " + rahul.name);

    }
}
