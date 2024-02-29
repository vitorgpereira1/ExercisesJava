package exercises.programmingLogic.sequential_structure;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();
        int value4 = scanner.nextInt();

        int difference = (value1 * value2 - value3 * value4);
        System.out.println("Difference = " + difference);

        scanner.close();
    }
}
