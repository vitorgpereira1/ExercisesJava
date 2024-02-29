package exercises.orientedObjectProgramming.exercise2_oop.application;

import exercises.orientedObjectProgramming.exercise2_oop.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rect.widht = scanner.nextDouble();
        rect.height = scanner.nextDouble();

        System.out.printf("AREA: %.2f%n", rect.area());
        System.out.printf("PERIMETER: %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rect.diagonal());
        scanner.close();
    }
}
