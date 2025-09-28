import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secret = (int) (Math.random() * 10) + 1;
        int guess;

        //Input guess
        do {
            System.out.print("Guess the number (1 - 10): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input, enter a number from 1 - 10: ");
                scanner.next();
            }
            guess = scanner.nextInt();
            if (guess < 1 || guess > 10) {
                System.out.println("Guess must be between 1 and 10.");
            }
        } while (guess < 1 || guess > 10);

        //display numbers and results
            System.out.println("The random number was: " + secret);
            if (guess > secret) {
                System.out.println("Your guess was high!");
            } else if (guess < secret) {
                System.out.println("Your guess was low!");
            } else {
                System.out.println("Your guess was right on!");
            }

            scanner.close();
        }
    }
