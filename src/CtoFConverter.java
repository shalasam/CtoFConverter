import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();  // Clear the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!done);

        // Calculate Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
    }
}