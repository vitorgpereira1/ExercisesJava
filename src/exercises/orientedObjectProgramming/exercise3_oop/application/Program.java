package exercises.orientedObjectProgramming.exercise3_oop.application;

import exercises.orientedObjectProgramming.exercise3_oop.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: " + employee.toString());
        System.out.println();

        System.out.print("Wich percentage to increase salary? ");
        double increaseSalary = scanner.nextDouble();
        employee.increaseSalary(increaseSalary);

        System.out.println("Update data: " + employee.toString());

        scanner.close();
    }
}
