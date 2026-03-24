package day8.assignment;

import java.util.Scanner;

public class LoopsTable {
    public static void main(String args[]) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter a num to print it's table: ");
        int num = inputReader.nextInt();

        int i = 1;

        // table with while loop
        System.out.println("------Using while loop------");
        while(i<=10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        System.out.println();

        // table with do-while loop
        System.out.println("------Using do-while loop------");
        do {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        while(i<=20);

        inputReader.close();
    }
}
