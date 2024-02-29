package exercises.orientedObjectProgramming.exercise1_oop.application;

import exercises.orientedObjectProgramming.exercise1_oop.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        int quantity;

        System.out.println("Enter product data: ");
        product.name = scanner.next();

        System.out.println("Price: ");
        product.price = scanner.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.println("Product data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product.toString());

        System.out.println();
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data: " + product.toString());

        scanner.close();
    }
}
