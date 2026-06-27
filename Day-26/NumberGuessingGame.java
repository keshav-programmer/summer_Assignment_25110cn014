import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        int secretNumber = rng.nextInt(100) + 1;
        int attemptCount = 0;
        int maxAttempts = 7;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

        while (attemptCount < maxAttempts) {
            System.out.print("Attempt " + (attemptCount + 1) + ": Enter your guess: ");
            int userGuess = sc.nextInt();
            attemptCount++;

            if (userGuess == secretNumber) {
                System.out.println("Correct! You guessed it in " + attemptCount + " attempt(s). Well done!");
                sc.close();
                return;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }
        System.out.println("Out of attempts! The secret number was " + secretNumber + ". Better luck next time.");
        sc.close();
    }
}
