package exercises.programmingLogic.conditional_structure;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        //que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        //qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        //Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        // renda 0 a 2000 = isento - 2000,01 a 3000 = 8% - 3000,01 a 4500 = 18% - acima de 4500 = 28%
        //Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        //salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        //de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        //duas casas decimais.

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        double tax = 0;
        if (salary <= 2000.00){
            tax = 0.0;
        }
        else if (salary <= 3000.00){
            tax = (salary - 2000.00) * 0.08;
        }
        else if (salary <= 4500){
            tax = (salary - 3000.00) * 0.18 + 1000 * 0.08;
        } else {
            tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (tax == 0.0){
            System.out.println("Exempted");
        } else {
            System.out.printf("R$ %.2f", tax);
        }

        scanner.close();
    }
}
