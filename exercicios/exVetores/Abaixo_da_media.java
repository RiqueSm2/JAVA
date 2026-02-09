package exercicios.exVetores;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 */
public class Abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        double soma = 0;
        for(int i = 0; i < numeros.length; i++){
        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();
        numeros[i] += num;
        soma += num;
        }

        double media = soma / numeros.length;
          
        System.out.printf("MEDIA DO VETOR = %.3f %n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
         for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < media){
                System.out.println(numeros[i]);
            }
          
            sc.close();

         } 
}
}
