package exercises.orientedObjectProgramming.exercisesVect.exercise2;

import java.util.Locale;
import java.util.Scanner;

public class VectSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        double somaValores = 0, mediaValores;

        System.out.print("Quantos números você irá digitar? ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextDouble();
        }

        for(int i = 0; i < n; i++){
            somaValores = somaValores + vect[i];
        }

        mediaValores = somaValores / n;

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.2f ", vect[i]);
        }
        System.out.printf("\nSOMA = %.2f\n",somaValores);
        System.out.printf("MEDIA = %.2f\n",mediaValores);

        scanner.close();
    }
}
