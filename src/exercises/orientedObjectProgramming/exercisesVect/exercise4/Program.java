package exercises.orientedObjectProgramming.exercisesVect.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Mariana");
        list.add("Claudia");
        list.add("Jefferson");
        list.add("Vitor");
        list.add(2, "Kiara");

        System.out.println("A lista tem " + list.size() + " nomes!");
        for (String names : list){
            System.out.println(names);
        }

        System.out.println("----------------------------------");
        list.remove(5);
        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println("A lista tem " + list.size() + " nomes!");
        for (String names : list){
            System.out.println(names);
        }

        System.out.println("----------------------------------");
        System.out.println("Index of Jefferson: " + list.indexOf("Jeffersonw"));
        System.out.println("------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());
        System.out.println("A lista tem " + result.size() + " nome(s)!");
        for (String names : result){
            System.out.println(names);
        }
        System.out.println("----------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
