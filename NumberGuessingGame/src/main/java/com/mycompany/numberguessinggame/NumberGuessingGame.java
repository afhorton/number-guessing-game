/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame2;

/**
 *
 * @author allenhorton
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame2 {

    public static void main(String[] args) {
        Random rand = new Random();
        //Generate a random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Congratulations!  You guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low.  Try again.");
            } else {
                System.out.println("Too high.  Try again.");
            }
        }
        scanner.close();
    }
}
