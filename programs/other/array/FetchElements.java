// Different ways of fetching the elements using ordinary for loop /forEach loop and toString().
package other.array;

import java.util.Arrays;

public class FetchElements {
    public static void main(String [] args) {
        int [] arr1 = new int[] {15, 2, 19, 21, 62, 99};

        arr1[arr1.length-1] = 38;

        // printing the elements using ordinary for() loop
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        // printing the elements using forEach() loop
        for(int ele: arr1) {
            System.out.println(ele);
        }
        System.out.println();
    
        // printing the elements using Arrays.toString() method
        System.out.println(Arrays.toString(arr1));
    }
}
