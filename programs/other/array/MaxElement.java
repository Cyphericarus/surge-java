// find the maximum element in the Array (Stream also)

package other.array;

class FindMax {
    public static int getMaxElement(int [] arr) {
        int max = arr[0];

        for(int curr: arr) {
            if(curr > max) 
                max = curr;
        }
        return max;
    }
}

public class MaxElement {
    public static void main(String[] args) {
        int [] arr = new int[] {20, 12, 43, 82, 132, 72};

        System.out.println("The max element in the array is: " + FindMax.getMaxElement(arr));
    }
}
