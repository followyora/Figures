package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the shape and its parameters: ");
            String userInput = scanner.nextLine();

            Figure figure = InputParser.parseInput(userInput);

            if (figure != null) {
                System.out.println("Shape characteristics:");
                System.out.println("Type: " + figure.getType());
                System.out.println("Area: " + figure.calculateArea());
                System.out.println("Perimeter: " + figure.calculatePerimeter());
                System.out.println(figure.getDetails());
                figure.print();
            } else {
                System.out.println("Invalid input. Please provide valid input.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. Please check your input and try again.");
        }
    }
}
