package exercises.repetitive_for_structure;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.

        int value = scanner.nextInt();
        int cont;
        for (cont = 0; cont <= value; cont++){
            if (cont % 2 == 1){
                System.out.println(cont);
            }
        }

        scanner.close();
    }
}
