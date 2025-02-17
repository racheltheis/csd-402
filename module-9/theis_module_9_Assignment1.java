//Rachel Theis
//Module 9 Assignment 
//Program 1
//CSD 402
//2.16.25


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListColorIndex {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Pink");
        words.add("Red");
        words.add("Orange");
        words.add("Yellow");
        words.add("Green");
        words.add("Blue");
        words.add("Indigo");
        words.add("Violet");
        words.add("Brown");
        words.add("Black");

        System.out.println("Colors:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i + 1) + ". " + words.get(i)); 
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index number (1-10) of the color that you'd like to see: ");

        try {
            int index = scanner.nextInt(); 

            String selectedWord = words.get(index - 1);
            System.out.println("\nYou selected: " + selectedWord);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Out of Bounds");
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        scanner.close();
    }
}

