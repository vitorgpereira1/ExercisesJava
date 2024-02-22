package exercises.conditional_structure;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
