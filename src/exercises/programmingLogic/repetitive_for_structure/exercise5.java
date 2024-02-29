package exercises.programmingLogic.repetitive_for_structure;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.

        int n = scanner.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++){
            fat = fat * i;
        }
        System.out.println(fat);

        scanner.close();
    }
}
