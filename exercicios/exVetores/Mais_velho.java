package exercicios.exVetores;
import java.util.Scanner;

import exercicios.Entidades.*;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */
public class Mais_velho {
    public static void main(String[] args) {
     
     Scanner sc = new Scanner (System.in);

     System.out.println("Quantas pessoas voce vai digitar? ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 0; i < n; i++){
      System.out.printf("Dados da %d° pessoa: %n", i + 1);
      System.out.println("Nome: ");
      String nome = sc.nextLine();
      System.out.println("Idade: ");
      int idade = sc.nextInt();
      Pessoa p = new Pessoa (nome, idade);
      Cad_Pessoa.adicionarPessoa(p);
      sc.nextLine();
     }

     System.out.println("Pessoa mais velha: " + Cad_Pessoa.maisVelha());
     
     sc.close();

    }
}
