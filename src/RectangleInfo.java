import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double width, height;

        //input measurements for width
        do {
            System.out.print("Enter width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input, enter a valid positive number for width:");
                scanner.next();
            }
            width = scanner.nextDouble();
        } while (width <= 0);

        //input measurements for height
        do {
            System.out.print("Enter the height of the rectangle (positive number): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a positive number for height: ");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);

        //area perimeter and diagonal calc
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

// Output results
        System.out.printf("Rectangle with width %.2f and height %.2f:%n", width, height);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        scanner.close();
    }
}
