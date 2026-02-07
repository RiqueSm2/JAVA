package exercicios.exVetores;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
 */
public class Soma_vetor {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();

    double [] vect = new double[n];

    for (int i = 0; i < vect.length; i++){
    System.out.print("Digite um numero: ");
    vect[i] = sc.nextDouble();
    }
     
    double soma = 0.0;
    System.out.print("VALORES: ");
    for (int i = 0; i < vect.length; i++){
    System.out.print(vect[i] + " ");   
    soma+= vect[i];
    }

    System.out.println("");    
    
    System.out.printf("%nSOMA= %.2f", soma);
    System.out.printf("%nMEDIA= %.2f", soma / vect.length );


    sc.close();
    }
    
}
