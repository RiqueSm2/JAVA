package exercicios.exVetores;

import java.util.Scanner;

import exercicios.Entidades.*;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */
public class Alturas {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
  
        
        System.out.println("Quantas pessoas serao digitas? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
        System.out.printf("Digite os dados da %d° pessoa: %n", i + 1);
        System.out.printf("Nome: ");
        String name = sc.nextLine();
        System.out.printf("Idade: ");
        int idade = sc.nextInt();
        System.out.printf("%n Altura: ");
        double altura = sc.nextDouble();
        Pessoa p = new Pessoa(name,idade,altura);
        Cad_Pessoa.adicionarPessoa(p);   
        sc.nextLine();
        }
        System.out.println("");
        
        System.out.printf("Altura média: %.2f %n", Cad_Pessoa.mediaAltura());
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", Cad_Pessoa.getPercentMenoresDe16() );
        /*Usando for para não imprimir os nomes entre colchetes */
        for (String nome : Cad_Pessoa.getMenoresDe16()) {
        System.out.println(nome);
          }
       sc.close();    



    }    
}
