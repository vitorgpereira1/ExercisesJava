package exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.listExercise.exercise1.application;

import exercises.orientedObjectProgramming.encapsulationAndOverloadExercises.listExercise.exercise1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();


        System.out.print("How many employees will be registered? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){

            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = scanner.nextInt();
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int increaseSalary = scanner.nextInt();
        Integer pos = position(list, increaseSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            list.get(pos).increaseSalary (percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : list){
            System.out.println(emp);
        }

        scanner.close();
    }

    static Integer position (List<Employee> list, int id){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
