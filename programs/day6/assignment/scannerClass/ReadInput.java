package day6.assignment.scannerClass;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter int val: ");
        int intVal = inputReader.nextInt();
        System.out.println();
        inputReader.nextLine();

        System.out.print("Enter string val: ");
        String stringVal = inputReader.nextLine();
        System.out.println();

        System.out.print("Enter double val: ");
        double doubleVal = inputReader.nextDouble();
        System.out.println();

        System.out.println(intVal);
        System.out.println(stringVal);
        System.out.println(doubleVal);

        inputReader.close();
    }
}
