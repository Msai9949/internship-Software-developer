import java.util.Random;
import java.util.Scanner;

public class Task1_TextGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 10:");

        do {
            guess = scanner.nextInt();
            if (guess < numberToGuess)
                System.out.println("Too low!");
            else if (guess > numberToGuess)
                System.out.println("Too high!");
        } while (guess != 7);

        System.out.println("Correct! The number was " + guess);
    }
}



