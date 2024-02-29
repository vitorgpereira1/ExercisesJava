package exercises.programmingLogic.repetitive_while_structure;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        int alcohol = 0, gasoline = 0, diesel = 0;

        int tipo = scanner.nextInt();
        while (tipo != 4){
            if (tipo == 1){
                alcohol += 1;
            }
            else if (tipo == 2) {
                gasoline += 1;
            }
            else if (tipo == 3) {
                diesel += 1;
            }
            else {
                System.out.println("Invalid code, enter again!");
            }
                tipo = scanner.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("Alcohol = " + alcohol);
        System.out.println("Gasoline = " + gasoline);
        System.out.println("Diesel = " + diesel);

        scanner.close();
    }
}
