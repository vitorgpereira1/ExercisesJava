package exercises.programmingLogic.conditional_structure;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        System.out.println("Digite um valor qualquer: ");
        double value = scanner.nextDouble();

        if (value >= 0 && value <= 25){
            System.out.println("The value is between [0,25]");
        } else if (value > 25 && value <= 50) {
            System.out.println("The value is between [25,50]");
        } else if (value > 50 && value <= 75) {
            System.out.println("The value is between [50,75]");
        } else if (value > 75 && value <= 100) {
            System.out.println("The value is between [75,100]");
        } else {
            System.out.println("Out of interval!");
        }


        scanner.close();
    }
}
