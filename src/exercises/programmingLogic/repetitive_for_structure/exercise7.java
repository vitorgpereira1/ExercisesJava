package exercises.programmingLogic.repetitive_for_structure;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        //exemplo.

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++){
            int quadradoN = i * i;
            int cuboN = quadradoN * i;

            System.out.printf("%d %d %d%n", i, quadradoN, cuboN);
        }

        scanner.close();
    }
}
