package Vetores;

import java.util.Scanner;

public class VetorValor {
 public static void main(String[] args){

/*PROGRAMA PARA LER A MEDIA DE ALTURA */

 Scanner sc = new Scanner(System.in);
 System.out.println("Quantidade de elementos no vetor: ");
 int n = sc.nextInt();/*Pegando a quantidade de elementos no vetor */
 double [] vect = new double[n]; /* Criando um vetor do tipo double  */

 for (int i = 0; i < n; i++){
  vect[i] = sc.nextDouble(); /*Adicionando elementos no vetor */  
      
 }

 double sum = 0.0;

 for (int i = 0; i < n; i++){
   sum+=vect[i];
 }
 
 double avg = sum/n;

 System.out.printf("Media de altura: %.2f", avg);

 sc.close();
 }
}