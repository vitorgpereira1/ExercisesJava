package exercises.repetitive_for_structure;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y == 0){
                System.out.println("Impossible division!!!");
            } else {
                double division = (double) x / y;
                System.out.printf("%.1f", division);
            }
        }

        scanner.close();
    }
}
