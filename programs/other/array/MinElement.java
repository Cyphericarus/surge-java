package other.array;

public class MinElement {
    public static void main(String[] args) {
        int [] arr = new int[] {20, 12, 43, 82, 132, 72};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value of the array is: " + min);
    }
}
