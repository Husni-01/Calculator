import java.util.Scanner; // Import Scanner class to take user input

/*
 This program is a simple Java calculator.
 It performs basic arithmetic operations:
 addition, subtraction, multiplication, and division.
*/
public class calculator {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble(); // Store first number

        // Ask the user for the second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble(); // Store second number

        // Ask the user to choose an arithmetic operation
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = sc.next().charAt(0); // Read the operator

        // Variable to store the result of the calculation
        double result;

        /*
         Use switch-case to perform
         the selected arithmetic operation
        */
        switch (operator) {
            case '+':
                // Addition
                result = num1 + num2;
                break;

            case '-':
                // Subtraction
                result = num1 - num2;
                break;

            case '*':
                // Multiplication
                result = num1 * num2;
                break;

            case '/':
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                // Division
                result = num1 / num2;
                break;

            default:
                // If operator is invalid
                System.out.println("Invalid operator!");
                return; // Exit the program
        }

        // Display the final result to the user
        System.out.println("Result: " + result);

        // Close the Scanner to free resources
        sc.close();
    }
}
