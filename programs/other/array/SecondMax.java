package other.array;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr = {20, 67, 34, 81, 35};
        int max = arr[0];
        int secMax = arr[0];
        int curr;

        for(int i = 1; i < arr.length; i++) {
            curr = arr[i];
            if(curr > max) {
                secMax = max;
                max = curr;
            }
            else if(curr > secMax && curr < max) {
                secMax = curr;
            }
        }
        
        System.out.println(secMax);

    }
}
