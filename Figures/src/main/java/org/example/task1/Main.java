package org.example.task1;



import org.example.task1.seasons.Month;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the month name (in English): ");
            String userInput = scanner.nextLine();
            if(Objects.equals(userInput, "exit")){
                System.exit(0);
            }

            try {
                Month selectedMonth = Month.valueOf(userInput.toUpperCase());

                System.out.println("The average temperature in " + selectedMonth.getMonthName() + " is "
                        + selectedMonth.getAverageTemperature() + " degrees Celsius.");
                System.out.println("This month belongs to the season: " + selectedMonth.getSeason());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid month name entered.");
            }
        }
    }
}
