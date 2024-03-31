package exercises.orientedObjectProgramming.matrices.exercise2.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Choose number: ");
        int chooseNumber = scanner.nextInt();


        System.out.println();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == chooseNumber){
                    System.out.println("Position " + i + "," +j + ":");
                    if (j > 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length -1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
