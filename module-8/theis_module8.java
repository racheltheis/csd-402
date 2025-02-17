//Rachel Theis
//Module 8 Assignment 
//CSD 402
//2.16.25

import java.util.ArrayList;
import java.util.Scanner;
//importing mismatchexception for error handling
import java.util.InputMismatchException;

public class RachelArrayListTest { 

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; 
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("This program will return the largest integer based on your input\nTo stop program, enter 0");
        //using try-catch block to handle invalid input 
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int input = scanner.nextInt();
                numbers.add(input);
                
                if (input == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error - please enter an integer.");
                scanner.next();
            }
        }

        scanner.close();

        Integer largest = max(numbers);
        System.out.println("The largest integer is: " + largest);
    }
}

