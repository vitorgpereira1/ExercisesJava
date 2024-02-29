package exercises.programmingLogic.conditional_structure;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 % number2 == 0 && number2 % number1 == 0){
            System.out.println("Are multiple");
        } else {
            System.out.println("Not are multiple");
        }

        scanner.close();
    }
}
