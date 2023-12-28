import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Guess Number game!");
        System.out.println("You will be asked to Guess a number to win a Game. Try to guess it!");

        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int attempts = 0;
        boolean hasWon = false;

        while (attempts <= 5) {  // You can adjust the number of attempts as needed
            System.out.print("Enter a guess number between 1 to 100: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                hasWon = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("your Guess Number is Smaller.");
            } else {
                System.out.println("your guess number is greater.");
            }
        }

        if (!hasWon) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
