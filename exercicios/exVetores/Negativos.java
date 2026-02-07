package exercicios.exVetores;

import java.util.Scanner;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/
public class Negativos {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);  
    System.out.println("Quantos numeros você vai digitar? ");
    int n = sc.nextInt();

    while (n > 10 || n <= 0) {
    System.out.println("Min. permitido é 0 e max 10.");   
    System.out.println("Quantos numeros você vai digitar? ");
    n = sc.nextInt();  
    }
    
    int[] vect = new int[n];

    for(int i = 0; i < vect.length; i ++){
    System.out.printf("Digite o %d numero: ", i + 1);
    vect[i] = sc.nextInt();
      
    }
    
    System.out.println("Numeros negativos:");
    for (int i = 0; i < vect.length; i ++){
       if(vect[i] < 0){
        System.out.println(vect[i]);

       }

    }
    

    sc.close();
    }
}
