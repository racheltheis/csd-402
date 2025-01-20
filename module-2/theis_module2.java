/*
Rachel Theis
CSD 402
1.19.24
Module 2 Programming Assignment 

This program is a rock-paper-scissors program that uses user input and randomly generated numbers
*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (true) {
            playRockPaperScissors(scanner);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }

    static void playRockPaperScissors(Scanner scanner) {
        System.out.println("Rock, paper, or scissors? (enter: 1 for rock / 2 for paper / 3 for scissors)");
        String playerMove = scanner.nextLine();

        while (!(playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3"))) {
            System.out.println("Invalid input. Please enter 1 for rock, 2 for paper, or 3 for scissors.");
            playerMove = scanner.nextLine();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(3); 
        
        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove);

        if (getMoveName(playerMove).equals(computerMove)) {
            System.out.println("Tie!");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("You won!");
        } else {
            System.out.println("Computer won!");
        }
    }

    static String getMoveName(String playerMove) {
        if (playerMove.equals("1")) {
            return "rock";
        } else if (playerMove.equals("2")) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("1")) { 
            return computerMove.equals("scissors");
        } else if (playerMove.equals("2")) { 
            return computerMove.equals("rock");
        } else { 
            return computerMove.equals("paper");
        }
    }
}
