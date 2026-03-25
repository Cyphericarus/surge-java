// WAP to print the array elements in reverse order. (user input)
package other.array;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int len = inputReader.nextInt();
        System.out.println();

        int[] arr = new int[len];

        // initializing the array elements using for loop
        for(int i = 0; i < len; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = inputReader.nextInt();
        }

        System.out.println("Elements of the array in Reverse order are: ");
        // printing the array elements
        for(int i = len-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        inputReader.close();
    }
}
