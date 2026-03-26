package other;

import java.util.*;

public class Scan {
    public static void main(String[] args) {
      Scanner inputReader = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int x = inputReader.nextInt();
      inputReader.nextLine();
      
      System.out.print("Enter an string: ");
      String y = inputReader.nextLine();

      System.out.print("Enter another integer: ");
      int z = inputReader.nextInt();
      
      System.out.println("Integer: " + x);
      System.out.println("String: " + y);
      System.out.println("Integer: " + z);

      inputReader.close();
    }
}
