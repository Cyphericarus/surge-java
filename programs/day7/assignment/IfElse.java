package day7.assignment;

import java.util.Scanner;

public class IfElse {

    public static String getGrade(int marks) {
        if (marks > 90) {
            return "Passed in the First Class";
        }
        else if (marks > 70 && marks <= 90) {
            return "Passed in the Second Class";
        }
        else if (marks > 45 && marks <= 70) {
            return "Passed in the Third Class";
        }
        else if (marks >=35 && marks <= 45) {
            return "Passed";
        }
        else {
            return "Failed";
        }
    }

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks of the student: ");
        int marks = input.nextInt();
        
        System.out.println("Student got " + getGrade(marks));
        System.out.println();

        input.close();
    }
}
