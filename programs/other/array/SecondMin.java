package other.array;

public class SecondMin {
    public static void main(String[] args) {
        int [] arr = {20, 67, 34, 19, 81, 11, 35};
        
        int min = arr[0];
        int secMin = arr[0];
        int curr = 0;

        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            if(curr < min) {
                secMin = min;
                min = curr;
            }
            else if(curr < secMin && curr > min) {
                secMin = curr;
            } 
        }
        System.out.println(secMin);
    }
}
