package Listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    List<String> lista = new ArrayList<>(); /* dentro de < > definimos o tipo da lista, integer, string.. */
   

    System.out.println("Digite uma palavra: ");
    String palavra = sc.nextLine();
    lista.add(palavra); /*adiciona o valor da variavel palavra na lista*/
    lista.add("Maçã");
    lista.add("Banana");
    
    /*Podemos usar o FOR para imprimir os valores da lista*/
    /*Aqui o for pecorre os valores da lista e joga eles para a variavel item */
    for (String item : lista) { 
        System.out.println(item);
    }

    /*remove o valor da posição 1 da lista (No caso "Maçã")*/ 
    lista.remove(1); 

    
    /*com o indexof conseguir a posição do elemento na lista e se não achar retor na -1*/
    int posicao;
    posicao = lista.indexOf("Uva");
    System.out.println(posicao); /*Se não achar retorna -1 */
     
    int divisão = 9 / lista.size();
    System.out.println(divisão);
    
    sc.close();

  }
    
}
