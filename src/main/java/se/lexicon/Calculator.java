package se.lexicon;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an operation (+, -, *, /) or 'exit' to quit ");
            String operation = input.next();

            if (operation.equals("exit")) {
                System.out.println("Exiting the calculator");
                break;
            }
            System.out.print("Enter first number: ");
            int x = input.nextInt();

            System.out.print("Enter second number: ");
            int y = input.nextInt();

            switch (operation) {
                case "+":
                    System.out.println("Result: " + (x + y));
                    break;
                case "-":
                    System.out.println("Result: " + (x - y));
                    break;
                case "*":
                    System.out.println("Result: " + (x * y));
                    break;
                case "/":
                    System.out.println("Result: " + (x / y));
                    break;
                default:
                    System.out.println("Invalid operation. Please enter a valid operation");
            }
        }
        input.close();
    }
}
