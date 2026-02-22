package exercicios.exVetoresEmatriz;

import java.util.Scanner;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).  */
public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] nota_sem1 = new double[n];
        double[] nota_sem2 = new double[n];
        sc.nextLine();
        
       for(int i = 0; i < nomes.length; i++){
       System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: %n", i + 1);
       String nome = sc.nextLine();
       double sem1 = sc.nextDouble();
       double sem2 = sc.nextDouble();
       nomes[i] = nome;
       nota_sem1[i] = sem1;
       nota_sem2[i] = sem2;
       sc.nextLine();
     }
     System.out.println("Alunos aprovados: ");
     for(int i = 0; i < nomes.length; i++){
        if (((nota_sem1[i] + nota_sem2[i]) / 2) > 6.0) {
          System.out.println(nomes[i]);
         
        }
     }
     
  
      sc.close();
     }

}

