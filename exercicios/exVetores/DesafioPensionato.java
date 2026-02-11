package exercicios.exVetores;

import java.util.Scanner;
import exercicios.Entidades.Rent;

public class DesafioPensionato {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   Rent[] vect = new Rent[10]; /*Vetor de objetos Rent*/
   

   System.out.println("How many rooms wil be rented? ");
   int renteds = sc.nextInt();
   

   for(int i = 0; i < renteds; i++){
     sc.nextLine();
     System.out.println("Rent #" + (i+1) + ":");
     System.out.print("Name: ");
     String name = sc.nextLine();
     System.out.print("Email: ");
     String email = sc.nextLine();
     System.out.print("Room: ");
     int room = sc.nextInt();

     vect[room] = new Rent(name,email); /*Instanciando e passando o objeto para o vetor */
   }
    
    System.out.println("Busy rooms: ");
    for(int i = 0; i < 10; i++){
     if(vect[i] != null){
      System.out.println(i + ": " + vect[i]);

     }


    }
  
    sc.close();





    /*Scanner sc = new Scanner(System.in);
    String[] quartos = new String[9];
    String[] name = new String[9];
    String[] email = new String[9];
    
    System.out.println("How many room wils be rented? ");
    int n =sc.nextInt();
    
    for(int i = 0; i < n; i++){
     sc.nextLine();   
     System.out.printf("Rent #%d: %n", i +1);

     System.out.print("Name: ");
     String nam = sc.nextLine();

     System.out.print("Email: ");
     String ema = sc.nextLine();

     System.out.print("Room: ");
     int room = sc.nextInt();

     name[room] = nam;
     email[room] = ema;
     quartos[room] = Integer.toString(room); /*Transformando o int em uma string   
    
     
    }
    System.out.println("Busy rooms: ");
    for(int i = 0; i < 9; i++){
     if(quartos[i] != null){
     System.out.println(quartos[i] + ": " + name[i] + ", " + email[i]);
        
     }      

    }
    sc.close(); */
    }
    
}
