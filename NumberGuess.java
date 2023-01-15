import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int target = rand.nextInt(100) + 1; // generate a random number between 1 and 100
    int guess;
    int tries = 0;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

    while (true) {
      System.out.print("Enter your guess: ");
      guess = input.nextInt();
      tries++;

      if (guess == target) {
        System.out.println("Congratulations! You guessed the number in " + tries + " tries.");
        break;
      } else if (guess < target) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
  }
}
