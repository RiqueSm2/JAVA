package exercicios.exVetoresEmatriz;

import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
 */
public class Soma_vetores {
 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
    
 System.out.println("Quantos valores em cada vetor? ");
 int n = sc.nextInt();
 int[] vA = new int[n];
 int[] vB = new int[n];
 int[] vC = new int[n];

  System.out.println("Digite os valores do vetor A: ");
  for (int i = 0; i < vA.length; i++){
  System.out.printf("Numero %d: %n", i + 1);  
  int num = sc.nextInt();
  vA[i] += num;  
  }

  System.out.println("Digite os valores do vetor B: ");
  for (int i = 0; i < vB.length; i++){
  System.out.printf("Numero %d: %n", i + 1);  
  int num = sc.nextInt();
  vB[i] += num;  
  }
  
  for (int i = 0; i < vC.length; i++){
   vC[i] += vA[i] + vB[i];
  }

  System.out.println("Valor resultante: ");
   for (int i = 0; i < vC.length; i++){
     System.out.println(vC[i]);
   }

   sc.close();

 }
    
}
