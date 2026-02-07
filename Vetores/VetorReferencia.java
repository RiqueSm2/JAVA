package Vetores;
import java.util.Scanner;

import Classes.Entidades.Product;

public class VetorReferencia {
    
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Tamanho do vetor: ");
    int n = sc.nextInt();
    Product[] vect = new Product[n]; /*Vetor capaz de armazenar n objetos do tipo Product*/
     
    for (int i = 0; i<vect.length; i++){ /*"Enquanto i for menor que o tamanho de vect */
       sc.nextLine(); /*Consumindo a quebra de linha pendente*/ 
       System.out.println("Nome do produto: ");
       String name = sc.nextLine();
       System.out.println("Preço: ");
       double price = sc.nextDouble();
       vect[i] = new Product(name, price);
    }
    
    double sum = 0.0;
     for (int i = 0; i < vect.length; i++){
     sum+=vect[i].getPrice(); /*Adicionando ao sum, o valor de Price na posição i do vetor */       
     }
     
     double avg = sum / vect.length;
     System.out.printf("AVERAGE PRICE = %.2f%n", avg);
     sc.close();

    }
    }
