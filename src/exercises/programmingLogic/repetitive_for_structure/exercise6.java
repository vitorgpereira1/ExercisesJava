package exercises.programmingLogic.repetitive_for_structure;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler um número inteiro N e calcular todos os seus divisores.

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
