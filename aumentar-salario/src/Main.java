import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Nome: ");
        employee.name = sc.next();
        System.out.println("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee); //nome, salario liquido
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
       4 //nome, salario liquido
        sc.close();








    }
}