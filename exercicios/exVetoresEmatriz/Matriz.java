package exercicios.exVetoresEmatriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Tamanho da matriz: L X C");
     int m = sc.nextInt();
     int n = sc.nextInt();
     int [][] mat = new int [m][n];
    
    System.out.println("Adicione os numeros: ");
     for(int i = 0; i < mat.length; i++){
      for(int j = 0; j< mat[i].length; j++){
       mat[i][j] = sc.nextInt();
      }
     }
    System.out.println("Procure um valor: ");
     int valor = sc.nextInt();

     for(int i = 0; i < mat.length; i++){
      for(int j = 0; j< mat[i].length; j++){
       if( valor == mat[i][j]){
        System.out.println("Position " + i + "," + j + ":");
         if(j - 1 >= 0) {
          System.out.print("Left: " + mat[i][j - 1] + "\n");      
         }
         if(j + 1 <= mat.length){
          System.out.print("Right: "+ mat[i][j + 1] + "\n");  
         }
         if(i - 1 >= 0){
          System.out.print("Up: " + mat[i - 1][j] + "\n"); 
         } 
         if(i + 1 <= mat[i].length){
          System.out.print("Down: " + mat[i + 1][j] + "\n"); 
         }  
       }

     }
    }


    sc.close();
    }
}
