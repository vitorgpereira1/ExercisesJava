package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        System.out.println("Employee number: ");
        int employeeNumber = scanner.nextInt();

        System.out.println("Worked hours: ");
        double workedHours = scanner.nextDouble();
        // I used 'double' because it may have minutes

        System.out.println("Amount received per hour: ");
        double hourlyRate = scanner.nextDouble();

        double employeeSalary = workedHours * hourlyRate;

        System.out.println("Number = " + employeeNumber);
        System.out.printf("Salary = R$ %.2f", employeeSalary);

        scanner.close();
    }
}
