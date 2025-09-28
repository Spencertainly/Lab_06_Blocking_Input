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

        //fuel efficiency for mpg input
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon (mpg): ");
            if (scanner.hasNextDouble()) {
                mpg = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input, please enter a valid number");
                scanner.next(); //take input
            }
        } while (!validInput);

    //Price per gallon
        validInput = false;
        do
    {
        System.out.print("Enter the price of gas per gallon: ");
        if (scanner.hasNextDouble())
        {
            ppg = scanner.nextDouble();
            validInput = true;
        } else{
        System.out.println("Invalid input, please enter a valid number");
        scanner.next(); //take input
    }
    } while (!validInput);
    // math
        double costOf100Miles = (100 / mpg) * ppg;
        double maxDistance = gallons * mpg;
    //output message
        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costOf100Miles);
        System.out.printf("Distance reached with full tank: %.2f miles\n", maxDistance);

            scanner.close();
        }
    }