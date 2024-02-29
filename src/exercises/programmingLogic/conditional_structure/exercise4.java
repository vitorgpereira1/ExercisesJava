package exercises.programmingLogic.conditional_structure;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The game started at: ");
        int itStarted = scanner.nextInt();
        System.out.println("The game ended at: ");
        int itEnded = scanner.nextInt();

        int duration;
        if (itStarted < itEnded) {
            duration = itEnded - itStarted;
        } else {
            duration = 24 - itStarted + itEnded;
        }

        System.out.println("O jogo durou " + duration + " hora(s)!");
        scanner.close();
    }
}
