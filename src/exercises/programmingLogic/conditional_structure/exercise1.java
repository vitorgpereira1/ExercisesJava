package exercises.programmingLogic.conditional_structure;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("NEGATIVE");
        } else{
            System.out.println("NOT NEGATIVO");
        }
        scanner.close();
    }
}
