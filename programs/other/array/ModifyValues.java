package other.array;

import java.util.Arrays;

public class ModifyValues {

    public static int[] modify(int [] arr) {
        arr[0] = 65;
        arr[3] = 23;

        return arr;
    }

    public static void main(String[] args) {
        int []x = {100, 200, 300, 400, 500};
        System.out.println("The array before updating is: " + Arrays.toString(x));

        System.out.println("The modified array is: " + Arrays.toString(ModifyValues.modify(x)));
    }
}
