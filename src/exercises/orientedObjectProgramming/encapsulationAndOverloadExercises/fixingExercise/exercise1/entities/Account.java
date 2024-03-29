package exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.fixingExercise.exercise1.entities;

import org.w3c.dom.ls.LSOutput;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        balance += amount;
    }
    public void withDraw (double amount){
        balance -= amount + 5.0;
    }
    public String toString (){
        return "Account " +
                number +
                ", Holder: " +
                holder +
                String.format(", Balance: $ %.2f", balance);
    }


}
