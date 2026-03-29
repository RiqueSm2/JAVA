package EnumeracoesEcomposicoes;

import EnumeracoesEcomposicoes.entidades.*;
import EnumeracoesEcomposicoes.enums.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Ex1 { 

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String nameDepartment = sc.nextLine();
        
      
        System.out.println("Enter worker data: ");
        
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("LEVEL: ");
        String level = sc.nextLine();
        
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();
                 
                                         /*valueOf() serve para passar uma String para o Enums */      
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(nameDepartment));

        System.out.println("How many contracts to this worker: ");
        int num = sc.nextInt();
         
        for (int i = 0; i < num; i++){
          System.out.println("Enter contract #" + (i + 1) + " data: ");  
          System.out.println("Date (DD/MM/YYYY): ");
          Date contractDate = sdf.parse(sc.next());
          System.out.println("Value per hour: ");
          double valuePerHour = sc.nextDouble();
          System.out.println("Duration (hours): ");
          int hours = sc.nextInt();

          HourContract contract = new HourContract(contractDate, valuePerHour, hours);
          worker.addContract(contract);
        }
      
        System.out.println();
        System.out.println("Enter month and year to calculete income (MM/YYYY)");
        /*Outro jeito de pegar o mes e o ano */
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));/*Pegando as duas primeiras posiçoes apenas e transformando eles em inteiro */
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


       sc.close();
      }


    }