package exercises.programmingLogic.sequential_structure;
import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int code1 = scanner.nextInt();
        int pieceNumber1 = scanner.nextInt();
        double pieceValue1 = scanner.nextDouble();

        int code2 = scanner.nextInt();
        int pieceNumber2 = scanner.nextInt();
        double pieceValue2 = scanner.nextDouble();

        double amountToPay = (pieceNumber1 * pieceValue1) + (pieceNumber2 * pieceValue2);
        System.out.printf("Total amount payable: R$ %.2f", amountToPay);

        scanner.close();
    }
}
