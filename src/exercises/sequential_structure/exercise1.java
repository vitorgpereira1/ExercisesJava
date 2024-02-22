package exercises.sequential_structure;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}