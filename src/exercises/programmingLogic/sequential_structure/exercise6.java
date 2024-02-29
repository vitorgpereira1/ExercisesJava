package exercises.programmingLogic.sequential_structure;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        double valueA = scanner.nextDouble();
        double valueB = scanner.nextDouble();
        double valueC = scanner.nextDouble();

        double calculateTriangleArea, calculateCircleArea, calculateTrapezeArea, calculateSquareArea, calculateRectangleAra, PI;

        PI = 3.14159;
        calculateTriangleArea = (valueA * valueB) / 2;
        calculateCircleArea = PI * valueC * valueC;
        calculateTrapezeArea = (valueA + valueB) * valueC / 2 ;
        calculateSquareArea = valueB * valueB;
        calculateRectangleAra = valueA * valueB;

        System.out.printf("Triangle: %.3f%n", calculateTriangleArea);
        System.out.printf("Circle: %.3f%n", calculateCircleArea);
        System.out.printf("Trapeze: %.3f%n", calculateTrapezeArea);
        System.out.printf("Square: %.3f%n", calculateSquareArea);
        System.out.printf("Rectangle: %.3f%n", calculateRectangleAra);

        scanner.close();
    }
}

    // treinei usar metódos para cada ''coisa'', para calcular as areas
    /*
    public static double calculateTriangleArea (double base, double height){
        return (base * height) / 2;
    }
    public static double calculateCircleArea (double radius) {
        double pi = 3.14159;
        return pi * radius * radius;
    }
    public static double calculateTrapezeArea (double sideA, double sideB, double hight){
        return (sideA + sideB) * hight / 2;
    }
    public static double calculateSquareArea (double sideB){
        return sideB * sideB;
    }
    public static double calculateRectangleAra(double base, double hight){
        return base * hight;
    }
    */


