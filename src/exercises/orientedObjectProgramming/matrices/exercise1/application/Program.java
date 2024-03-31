package exercises.orientedObjectProgramming.matrices.exercise1.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++){
                System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        int countNegativeNumbers = 0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j< n; j++){
                if (mat[i][j] < 0){
                    countNegativeNumbers += 1;
                }
            }
        }
        System.out.println("Negative numbers = " + countNegativeNumbers);
        scanner.close();
    }
}
