package exercises.orientedObjectProgramming.dateAndTime.exercise2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            if (N % 2 == 1) {
                System.out.println("Weird");
            }else if (N % 2 == 0 && N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }else if (N % 2 == 0 && N >= 6 && N <= 20) {
                System.out.println("Weird");
            }else if (N % 2 == 0 && N > 20){
                    System.out.println("Not Weird");



}


                scanner.close();

    }
}
