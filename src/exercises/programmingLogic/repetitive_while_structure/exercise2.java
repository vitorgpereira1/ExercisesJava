package exercises.programmingLogic.repetitive_while_structure;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("First quadrant");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Second quadrant");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Third quadrant");
            }
            else {
                System.out.println("Fourth quadrant");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();

        }

        scanner.close();
    }
}
