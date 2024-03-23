package exercises.orientedObjectProgramming.exercisesVect.exercise3;

import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAge, nMinors;
        double totalHeights, heightAverage, minorsPercentage;

        System.out.print("How many people will be entered? ");
        int n = scanner.nextInt();
        int[] vect = new int[n];

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];


        for(int i = 0; i < n; i++){
            System.out.println("Date from " + (i + 1) + "ª person:");
            System.out.print("Name: ");
            name[i] = scanner.next();
            System.out.print("Age: ");
            age[i] = scanner.nextInt();
            System.out.print("Height: ");
            height[i] = scanner.nextDouble();
        }

        nMinors = 0;
        totalHeights = 0;
        for (int i = 0; i < n; i++){
            if (age[i] < 16){
                nMinors++;
            }
            totalHeights += height[i];
        }

        heightAverage = totalHeights / n;
        minorsPercentage = ((double) nMinors / n) * 100;

        System.out.printf("\nAverage Height: %.2f%n", heightAverage);
        System.out.printf("People under 16: %.1f%%\n", minorsPercentage);
        for (int i = 0; i < n; i++){
            if (age[i] < 16){
                System.out.println(name[i]);
            }
        }

        scanner.close();
    }
}
