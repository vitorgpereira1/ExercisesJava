package exercises.orientedObjectProgramming.exercise5_oop.util;

public class CurrencyConverter {

    public static double price, dollars;
    public static double valueConverter (double price, double dollars){
        double valueWithoutTax =  dollars * price;
        return valueWithoutTax += valueWithoutTax * 6 / 100;
    }
}
