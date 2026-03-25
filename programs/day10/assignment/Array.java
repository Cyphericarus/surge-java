package day10.assignment;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       

public class Array {
    public static void main(String [] args) {

        System.out.println("Printing 1D Array using WHILE loop");
        int arrOne [] = {70, 20, 40, 90, 20};

        int i = 0;

        while (i < arrOne.length) {
            System.out.println(arrOne[i]);
            i++;
        }
        System.out.println();

        System.out.println("Printing Multi-D Array using FOR loop");
        int arrTwo [][] = {{83, 43, 71, 21}, {32, 45, 90}, {63, 12, 91, 10, 51}};

        for (int j = 0; j < arrTwo.length; j++) {
            for(int k =0; k < arrTwo[j].length; k++) {
                System.out.print(arrTwo[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


