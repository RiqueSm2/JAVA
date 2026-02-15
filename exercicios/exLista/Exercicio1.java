package exercicios.exLista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.Entidades.Employer;

public class Exercicio1 {
    public static void main (String[]args){
 
 List<Employer> list = new ArrayList<>() ;  

 Scanner sc = new Scanner(System.in);
 
  System.out.println("How many employees will be registered? ");
 int n = sc.nextInt();
 
 for (int i = 0; i < n; i++){
   System.out.println("Employee #" + (i + 1));

   System.out.print("Id: ");
   int id = sc.nextInt();
   
   
   for(Employer x : list){
    if(x.getId() == id){
      System.out.println("Esse ID ja existe!");

      sc.close();
      return;
    }
     }//fim do forEach
   sc.nextLine();
   System.out.print("Name: ");
   String name = sc.nextLine();

   System.out.print("Salary: ");
   double salary = sc.nextDouble();
   
   Employer emp = new Employer(id, name,salary);
   list.add(emp);
   
  }//Fim do for
   
  System.out.println("");
  System.out.print("Enter the employee id that will have salary increase: ");
  int empID = sc.nextInt();
  for(Employer x : list){

    if(x.getId() != empID){
      System.out.println("Esse ID não ja existe!");
      sc.close();
      return;
    }

  }

  System.out.println("Enter the percentage: ");
  double empIncrease = sc.nextDouble();
  
  for(Employer x : list){
    if(x.getId() == empID){
     x.setSalary(empIncrease);
    }
  }

  System.out.println("List of employers: ");

  for(Employer y : list){
    System.out.println(y);

  }
      
   sc.close();
   
   } 
    }

  