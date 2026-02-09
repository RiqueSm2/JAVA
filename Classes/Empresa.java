package Classes;
import Classes.Entidades.*;
import java.util.Scanner;
import java.util.Locale;


public class Empresa{
  
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        Employee_EMPRESA emp = new Employee_EMPRESA();
        
        System.out.printf("Nome: ");
        emp.name = sc.nextLine();

        System.out.printf("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.printf("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s, %.2f", emp.name, emp.netSalary());
        
        System.out.printf("Wich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println(emp);


        sc.close();
    }
}
       

       
