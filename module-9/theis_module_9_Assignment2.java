//Rachel Theis
//Module 9 Assignment
//Program 2
//CSD 402
//2.16.25

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileNumGen {
    public static void main(String[] args) {
        String fileName = "data.file";
        Random random = new Random();

        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            
            System.out.println("This program will write 10 random numbers between 1-1000 to a file");
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(1000); 
                bufferedWriter.write(randomNumber + " ");
            }
            bufferedWriter.newLine();
            System.out.println("Success!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("\nNumbers written to the file:");
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            e.printStackTrace();
        }
    }
}

