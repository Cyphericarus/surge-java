package other.exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        int i = 4;
        int j = 15;

        int[] arr = { 4, 5, 6, 7 };

        // String s = null;

        try {
            System.out.println(j / i);
            System.out.println(arr[2]);
            // System.out.println(s.length());


        } catch (ArithmeticException e) {
            System.err.println("Zero Division Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index is out of bounds");
        }
        catch (Exception e) {
            System.out.println("There is an Exception");
        }
    }
}
