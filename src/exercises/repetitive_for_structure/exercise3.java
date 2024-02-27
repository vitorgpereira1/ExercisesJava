package exercises.repetitive_for_structure;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        //de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        //peso 5.

        int N = scanner.nextInt();

        for (int cont = 0; cont < N; cont++){

            double value1 = scanner.nextDouble();
            double value2 = scanner.nextDouble();
            double value3 = scanner.nextDouble();

            double average = (value1 * 2.0 + value2 * 3.0 + value3 * 5.0) / 10;
            System.out.printf("%.1f ",average);
        }

        scanner.close();
    }
}
