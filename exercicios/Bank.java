package exercicios;
import java.util.Scanner;

import Classes.Entidades.BankAccount;

public class Bank {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     /*É necessário criar o objeto assim para que ele exista fora do IF/ELSE */
     BankAccount bc;

     /*Falta colocar condição de no max. 4 digitos */
     System.out.println("Enter account number: " );  
     int numberAccount = sc.nextInt();
     sc.nextLine();
     System.out.println("Enter account holder: ");
     String name = sc.nextLine(); 
       
     /*------------------------------------------ */
     System.out.println("Is there initial deposit (y/n): ");
     String initial = sc.nextLine();
     if (initial.equals("y")){
       System.out.println("Enter initial deposit value: ");
       double deposit = sc.nextDouble(); 
       bc = new BankAccount(numberAccount, name, deposit);
       
     } else if (initial.equals("n")){
       bc= new BankAccount(numberAccount, name);
     } else {
            System.out.println("Digite apenas s ou n");
        sc.close();
        return; /*Encerrando o main */
     }
   
     System.out.println("Account data: \n" + bc.toString());
     System.out.println(" ");
     /*------------------------------------------ */
     System.out.println("Enter a deposit value: ");
     double deposit = sc.nextDouble();
     sc.nextLine();
     bc.setDeposit(deposit);
     System.out.println("Update account data: " + bc.toString());
     System.out.println(" ");
     /*------------------------------------------ */
     
     System.out.println("Enter a withdraw value: ");
     double withdraw = sc.nextInt();
     sc.nextLine();
     bc.setWithdraw(withdraw);
     System.out.println("Update account data: " + bc.toString());



     sc.close();

     } 
     }
    

