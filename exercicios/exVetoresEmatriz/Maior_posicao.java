package exercicios.exVetoresEmatriz;

import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).  */
public class Maior_posicao {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos numeros voce vai digitar: ");
    int n = sc.nextInt();

    double[] numeros = new double[n];

    for (int i = 0; i < numeros.length; i++){
    System.out.println("Digite um numero: ");
    double num = sc.nextDouble();
    numeros[i] += num;    
    }
    
    double maior = numeros[0];
    int cont = 0, posicao = 0;

    for (int i = 0; i < numeros.length; i++){
      cont+=1;
        if(maior < numeros[i]) {
         maior = numeros[i];
         posicao = cont - 1;
        }    
        }
    System.out.printf("MAIOR VALOR = %.1f %n", maior);
    System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicao);
    
    sc.close();
    }
}
