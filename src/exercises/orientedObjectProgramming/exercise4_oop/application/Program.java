package exercises.orientedObjectProgramming.exercise4_oop.application;

import exercises.orientedObjectProgramming.exercise4_oop.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();

        System.out.print("Studant name: ");
        student.name = scanner.nextLine();

        System.out.print("Grade1: ");
        student.grade1 = scanner.nextDouble();
        System.out.print("Grade2: ");
        student.grade2 = scanner.nextDouble();
        System.out.print("Grade3: ");
        student.grade3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED!");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS! CONGRATULATIONS!!");
        }

        scanner.close();
    }
}
