package other.array.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinElement {
    public static void main(String[] args) {
        int [] x = {20, 56, 99, 15, 19, 37, -45, -32};

        OptionalInt minElement = Arrays.stream(x).min();

        minElement.ifPresent(y -> System.out.println(y));
    }
}
