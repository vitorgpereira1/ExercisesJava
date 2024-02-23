package exercises.conditional_structure;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar

        /*Items:
        1 - Hotdog = 4,00
        2 - X-Salad = 4,50
        3 - X-Bacon = 5,00
        4 - Simple toast = 2,00
        5 - Soda = 1,50

        */

        System.out.println("Item code: ");
        int code = scanner.nextInt();

        System.out.println("Item quantity: ");
        int quantity = scanner.nextInt();

        double amountToPay = 0;
        if (code == 1){
            amountToPay = quantity * 4.00;
        } else if (code == 2) {
            amountToPay = quantity * 4.50;
        } else if (code == 3) {
            amountToPay = quantity * 5.00;
        } else if (code == 4) {
            amountToPay = quantity * 2.00;
        } else if (code == 5) {
            amountToPay = quantity * 1.50;
        }

        System.out.printf("Total: R$ %.2f", amountToPay);

        scanner.close();
    }
}
