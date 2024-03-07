package exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.fixingExercise.exercise1.application;

import exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.fixingExercise.exercise1.entities.Account;

import java.util.AbstractCollection;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
        //titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
        //inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
        //conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        //Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
        //o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
        //exemplo).
        //Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
        //isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
        //realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
        //suficiente para realizar o saque e/ou pagar a taxa.
        //Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
        //informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
        //mostrando os dados da conta após cada operação.

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Is there na initial deposit? (y/n)");
        char resp = scanner.next().charAt(0);
        if (resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        account.withDraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account.toString());

        scanner.close();
    }
}
