/*
Rachel Theis
CSD 402
1.19.25
This program will execute and display the a formatted triangle of a numeric sequence 
that has "@" symbols at the end of each line

*/

public class NumericPyramid {
    public static void main(String[] args) {
        int Rows = 7; 

        int Width = 2 * Rows - 1;

        for (int row = 0; row < Rows; row++) {
            int numElementsInRow = 2 * row + 1;

            int leadingSpaces = (Width - numElementsInRow) / 2;

            for (int space = 0; space < leadingSpaces; space++) {
                System.out.print(" ");
            }

            for (int i = 0; i <= row; i++) {
                System.out.print((int) Math.pow(2, i) + " ");
            }

            for (int i = row - 1; i >= 0; i--) {
                System.out.print((int) Math.pow(2, i) + " ");
            }

            int spacesBeforeAt = Width - numElementsInRow - leadingSpaces;
            for (int i = 0; i < spacesBeforeAt; i++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}

