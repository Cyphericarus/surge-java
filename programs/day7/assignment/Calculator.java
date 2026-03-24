package day7.assignment;

import java.util.Scanner;

public class Calculator {
    public static void calculator(int option, int n1, int n2) {
        switch (option) {
            case 1:
                System.out.println("Result is: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Result is: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Result is: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Result is: " + ((double) n1 / (double) n2));
                break;
            case 5:
                System.out.println("Result is: " + (n1 % n2));
                break;
            default:
                System.err.println("Select a valid option");
        }
    }

    public static void exitCalculator() {
        System.out.println("Exited Successfully");
        System.exit(0);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int option = 0;

        do {
            System.out.print("Enter the value of 1st num: ");
            int n1 = input.nextInt();

            System.out.print("Enter the value of 2nd num: ");
            int n2 = input.nextInt();

            System.out.println();
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. EXIT");
            System.out.print("Select an option bw 1 to 6: ");
            option = input.nextInt();
            if (option < 1 && option > 6) {
                System.err.println("Select an option bw 1 to 6 only.");
            } else {
                if (option == 6) {
                    exitCalculator();
                }
                calculator(option, n1, n2);
            }
            System.out.println();
            System.out.println("1. Do more operations\n2. EXIT");
            System.out.print("Select either 1 or 2: ");
            int secOption = input.nextInt();

            if(secOption == 2) {
                exitCalculator();
            }
        } while (option > 0 && option < 6);

        input.close();
    }
}
