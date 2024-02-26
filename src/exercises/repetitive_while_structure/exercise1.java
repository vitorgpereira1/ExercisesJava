package exercises.repetitive_while_structure;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002

        System.out.println("Type your password: ");
        int password = scanner.nextInt();

        while (password != 2002){
            System.out.println("Invalid password!");
            password = scanner.nextInt();
        }

        System.out.println("Access allowed!");

        scanner.close();
    }
}
