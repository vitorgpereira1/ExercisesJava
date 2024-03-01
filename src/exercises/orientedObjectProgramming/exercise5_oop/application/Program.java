package exercises.orientedObjectProgramming.exercise5_oop.application;

import exercises.orientedObjectProgramming.exercise5_oop.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price? ");
        double price = scanner.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollars = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n ", CurrencyConverter.valueConverter(price, dollars));
        scanner.close();
    }
}
