package exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.classExercise.application;

import exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.classExercise.entities.Product2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product data: ");
        String name = scanner.next();

        System.out.print("Price: ");
        Double price = scanner.nextDouble();

        Product2 product2 = new Product2(name,price);


        System.out.println();
        System.out.println("Product data: " + product2.toString());

        System.out.println();
        product2.setName ("Computer");
        System.out.println("Update name: " + product2.getName());

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product2.addProducts(quantity);

        System.out.println("Update data: " + product2.toString());

        System.out.println();
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product2.removeProducts(quantity);

        System.out.println("Update data: " + product2.toString());

        scanner.close();
    }
}

