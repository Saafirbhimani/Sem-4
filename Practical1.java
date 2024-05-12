import java.util.Scanner;
public class Practical1 {
    public static void main(String[] args) {
        SimpleJava obj1 = new SimpleJava();
    }}
class SimpleJava {
    SimpleJava() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.println("Enter your weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Prompt the user to enter height in inches
        System.out.println("Enter your height in inches: ");
        double heightInInches = scanner.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKg = weightInPounds * 0.45359237;

        // Convert height from inches to meters
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);


        // Display the BMI
        System.out.println("Your BMI is: " + bmi);

        // Close the scanner
        scanner.close();
    }
}
