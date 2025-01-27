/*
Rachel Theis
Module 4.2 Assignment
CSD 402
1.19.25
This program uses various array methods to calculate the averages of test sequences

*/

public class ArrayAverage {
    
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }
    
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {-111, -22, 3, 44, 555};
        int[] intArray = {11, 222, 3333, 44444};
        long[] longArray = {100L, 2000L, 30000L};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        
        System.out.println("Short Array (test sequence): " + java.util.Arrays.toString(shortArray));    
        System.out.println("Average of short array: " + average(shortArray));
        
        System.out.println("\nInt Array (test sequence): " + java.util.Arrays.toString(intArray));
        System.out.println("Average of int array: " + average(intArray));
        
        System.out.println("\nLong Array (test sequence): " + java.util.Arrays.toString(longArray));
        System.out.println("Average of long array: " + average(longArray));
        
        System.out.println("\nDouble Array (test sequence): " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average of double array: " + average(doubleArray));
        
    }
}
