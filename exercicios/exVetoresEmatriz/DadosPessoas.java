package exercicios.exVetoresEmatriz;

import java.util.Locale;
import java.util.Scanner;

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */
public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        double media_mulheres = 0;
        int cont_homens = 0;

     for(int i = 0; i < n; i++){
       System.out.printf("Altura da %d° pessoa: ", i + 1);
       altura[i] = sc.nextDouble();
       sc.nextLine();

       System.out.printf("Genero: ");
       char genero = sc.next().charAt(0);
        if(genero == 'M'){
            cont_homens +=1;
        } else{
            media_mulheres += altura[i];
        }
     }
     media_mulheres = media_mulheres / (n - cont_homens);
     double menor = altura[0];
     double maior = altura[0];

     for(int i = 0; i < n; i++){
      if(menor > altura[i]){
        menor = altura[i];
      }
      if(maior < altura[i]){
        maior = altura[i];
      }
     }
     
    System.out.printf("Menor altura = %.2f %n", menor);
    System.out.printf("Maior altura = %.2f %n", maior);
    System.out.printf("Media altura das mulheres = %.2f %n", media_mulheres);
    System.out.println("Numero de homens = " + cont_homens);

    sc.close();
    }
    
}
