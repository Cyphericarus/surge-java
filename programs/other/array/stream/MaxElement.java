package other.array.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxElement {
    public static void main(String[] args) {
        int [] arr = new int[] {20, 32, 43, 82, 12, -72};

        OptionalInt maxElement = Arrays.stream(arr).max();

        maxElement.ifPresent(System.out::println);
    }
}
