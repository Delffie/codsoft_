
import java.util.Random;
import java.util.Scanner;

public class del {

    // Method to generate a random number between 1 and 100
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // Method to play one round of the game
    public static void playRound(int maxAttempts) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = generateRandomNumber();
        int attempts = 0;

        System.out.println("\nA number between 1 and 100 has been chosen.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (attempt " + (attempts + 1) + "): ");
            
            // Check for valid integer input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();  // Clear invalid input
                continue;
            }

            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Correct! You've guessed the number " + targetNumber + " in " + attempts + " attempts.");
                return;  // End the round
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("You've used all " + maxAttempts + " attempts! The correct number was " + targetNumber + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 7;
        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Guess the Number Game!");

        while (true) {
            roundsPlayed++;

            // Play one round of the game
            playRound(maxAttempts);

            // Ask if the user wants to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display the final score
        System.out.println("\nYou've played " + roundsPlayed + " round(s).");
        System.out.println("Thank you for playing!");
    }
}


