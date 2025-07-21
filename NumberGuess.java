import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain;

        System.out.println("Welcome to the Number Guessing Game!");


        do {
            int numberToGuess = rand.nextInt(101) ; 
            int attempts = 7; 
            boolean isGuessed = false;

            System.out.println("\nI have picked a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess it.");

            for (int i = 1; i <= attempts; i++) 
            {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess == numberToGuess)
                {
                    System.out.println(" Correct! You guessed the number in " + i + " attempts.");
                    score++;
                    isGuessed = true;
                    break;
                } else if (userGuess < numberToGuess) 
                {
                    System.out.println("Too low! Try a higher number.");
                } else
                {
                    System.out.println("Too high! Try a lower number.");
                }
            }

            if (!isGuessed) 
            {
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            sc.nextLine(); 
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("\n Game Over! Your total score: " + score + " round(s) won.");
        sc.close();
    }
}
