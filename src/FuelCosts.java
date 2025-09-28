import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       double gallons = 0.0;
       double mpg = 0.0; //miles per gallon
       double ppg = 0.0; //price per gallon
       boolean validInput;

       validInput = false;
        do {
            System.out.print("Enter the gallon amount of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                validInput = true;

            } else {
                System.out.println("Invalid input, please enter a valid number");
                scanner.next(); //take input
            }
        } while (!validInput);


    }
}