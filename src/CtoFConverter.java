import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Variables here
        double celsius;
        boolean validInput = false;
        //prompt user with question
        do {
            System.out.print("Enter temperature in Celsius");
            if (scanner.hasNextDouble()) ;
            celsius = scanner.nextDouble();
            validInput = true;

        } else { // Incorrect input message read to invalid entries
            System.out.println("Invalid input, please enter a valid input");
            scanner.next(); //takes response to prevent looping
            celsius = 0; // placeholder
        }
        while (!validInput);
}