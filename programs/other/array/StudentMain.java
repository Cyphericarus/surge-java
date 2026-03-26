// WAP to create Student array Object to hold multiple Student object dynamically.

package other.array;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    char grade;

    Student(int rollNo, String name, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + "]";
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter size of the Student array: ");
        int len = inputReader.nextInt();
        System.out.println();

        Student[] students = new Student[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter roll no of student " + (i+1) + ": ");
            int rollNo = inputReader.nextInt();
            inputReader.nextLine();

            System.out.print("Enter name of student " + (i+1) + ": ");
            String name = inputReader.nextLine();

            System.out.print("Enter grade of student " + (i+1) + ": ");
            char grade = inputReader.next().charAt(0);

            students[i] = new Student(rollNo, name, grade);
            System.out.println();
        }

        for (Student student : students) {
            System.out.println(student.toString());

        }

        inputReader.close();
    }
}
