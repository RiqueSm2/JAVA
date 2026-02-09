package exercicios.exVetores;
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/

import java.util.Scanner;

public class Numeros_pares {
    public static void main(String[] args) {
        
     
Scanner sc = new Scanner(System.in);


System.out.println("Quantos numeros voce vai digitar? ");
int n = sc.nextInt();
int[] numeros = new int[n];


for (int i = 0; i < numeros.length; i++){
  System.out.print("Digite um numero: ");
  int num = sc.nextInt();
  numeros[i] += num;
}

System.out.println("Numeros pares: ");
int cont = 0;

for (int i = 0; i < numeros.length; i++){
  if (numeros[i] % 2 == 0){
   cont+= 1;
   System.out.println(numeros[i]);
    }   
}
System.out.println("QUANTIDADE DE PARES: " + cont);

sc.close();
}
}