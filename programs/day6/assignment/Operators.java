package day6.assignment;
import java.util.Scanner;

public class Operators {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------- Arithmetic Operators-------------");
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        System.out.println("Sum is: " + (a+b));
        System.out.println("Subtraction is: " + (a-b));
        System.out.println("Product is: " + (a*b));
        System.out.println("Division is: " + (a/b));
        System.out.println("Mod is: " + (a%b));
        System.out.println();

        System.out.println("--------- Assignment Operators-------------");
        System.out.print("Enter value of c: ");
        int c = input.nextInt();
        System.out.println("Add & assign: " + (c += 10));
        System.out.println("Subtract & assign: " + (c -= 3));
        System.out.println("Multiply & assign: " + (c *= 2));
        System.out.println("Divide & assign: " + (c /= 2));
        System.out.println("Mod & assign: " + (c %= 4));
        System.out.println();

        System.out.println("--------- Boolean Operators-------------");
        System.out.print("Enter value of p: ");
        int p = input.nextInt();
        System.out.print("Enter value of q: ");
        int q = input.nextInt();
        System.out.println(p & q);  // 101 111
        System.out.println(p | q);
        System.out.println();

        // Bitwise Operators
        System.out.println("--------- Bitwise Operators-------------");
        System.out.print("Enter value of r: ");
        int r = input.nextInt();
        System.out.print("Enter value of s: ");
        int s = input.nextInt();
        System.out.println(r ^ s);
        System.out.println(~ s);
        System.out.println(r >> s);
        System.out.println(r << s);
        System.out.println();

        System.out.println("--------- Logical Operators-------------");
        System.out.print("Enter value of d: ");
        int d = input.nextInt();
        System.out.print("Enter value of e: ");
        int e = input.nextInt();
        System.out.print("Enter value of f: ");
        int f = input.nextInt(); 
        System.out.println(d > e && e > f);
        System.out.println(d > e || e > f);
        System.out.println(!(d > e));

        System.out.println("--------- Relational Operators-------------");
        System.out.print("Enter value of g: ");
        int g = input.nextInt();
        System.out.print("Enter value of h: ");
        int h = input.nextInt();
        System.out.print("Enter value of i: ");
        int i = input.nextInt();
        System.out.println(g == h);
        System.out.println(h > i);
        System.out.println(i < g);
        System.out.println(h >= g);
        System.out.println(i <= h);
        System.out.println(g != h);
        System.out.println();

        System.out.println("--------- Ternary Operators-------------");
        System.out.print("Enter value of m: ");
        int m = input.nextInt();
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        System.out.println(m > n ? true : false);
        System.out.println();

        System.out.println("--------- Unary Operators-------------");
        System.out.print("Enter value of j: ");
        int j = input.nextInt();
        System.out.print("Enter value of k: ");
        int k = input.nextInt();
        System.out.println(j++);
        System.out.println(++j);
        System.out.println(k--);
        System.out.println(--k);
        System.out.println(+(j));
        System.out.println(-(k));
        input.close();
    }
}







        