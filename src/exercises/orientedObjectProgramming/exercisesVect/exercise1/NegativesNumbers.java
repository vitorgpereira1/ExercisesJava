package exercises.orientedObjectProgramming.exercisesVect.exercise1;

import java.util.Scanner;

public class NegativesNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] vect = new int[N];


        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();

        }
        System.out.println();
        System.out.println("Negatives numbers: ");
        for (int i = 0; i < N; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        scanner.close();
    }
}
