// find the sum of all elements of the array.
package other.array;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr1 = new int[] {15, 2, 19, 21, 62, 99};
        
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }

        System.out.println("Sum of the elements is: " + sum);
    }
}


