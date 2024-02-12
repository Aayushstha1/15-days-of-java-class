import java.util.Scanner;
import java.util.Random;

public class day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (true) {
            try {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // clear the scanner buffer
            }
        }

        scanner.close();
    }
}

