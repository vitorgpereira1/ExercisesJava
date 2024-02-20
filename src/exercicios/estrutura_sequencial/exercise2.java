package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        double radiusValue = scanner.nextDouble();

        double valueArea = 3.14159 * radiusValue * radiusValue;

        System.out.printf("A= %.4f", valueArea);

        scanner.close();
    }
}
