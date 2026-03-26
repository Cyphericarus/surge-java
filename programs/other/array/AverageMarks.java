// calculate the student marks and find out the average.
package other.array;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int[] marks;

        try (inputReader) {
            // setting the array size
            System.out.print("Enter no of subjects: ");
            int len = inputReader.nextInt();
            System.out.println();
            marks = new int[len];

            // getting marks
            for (int i = 0; i < len; i++) {
                System.out.print("Enter marks in subject " + (i + 1) + ": ");
                marks[i] = inputReader.nextInt();
            }

            // finding total marks
            int totalMarks = 0;
            for (int ele : marks) {
                totalMarks += ele; 
            }

            System.out.println();
            System.out.println("The sum of marks is: " + totalMarks);
            System.out.println("The average of marks is: " + (totalMarks / len));

        } catch (NegativeArraySizeException e) {
            System.err.println("Array size must always be POSITIVE");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input");
        }
    }
}
