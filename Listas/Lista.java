package Listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
  /*Lista é uma estrutura homogenea e ordenada,
       ela inicia vazia e seus elementos sao colocados sob demanda,
       cada elemento ocupo um "nó" ou "nodo" na lista.
       Vantagens: Tamanho variavel, facilidade para se realizar insercoes e delecoes.
       Desvantagens: Acesso sequencial aos elementos (Dependendo do tipo de lista, é mais otimizado)
       */



public class Lista {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     /*List é uma interface
    List<Generics> 'nome' = new ClasseQueImplementaInterface<> */
    List<String> lista = new ArrayList<>(); 
    
  
    /*Adicionando valaores na lista */
    System.out.println("Digite uma palavra: ");
    String palavra = sc.nextLine();
    /*adiciona o valor da variavel palavra na lista*/
    lista.add(palavra); 
    lista.add("Kiwi");
    lista.add("Maça");
    lista.add("Banana");
    lista.add("Abacate");
    lista.add("Acerola");
    
    
    /*Adicionando na posição 2 da lista */
    lista.add(2, "Laranja"); 

    /*Compara e se achar, remove da lista. Pode-se colocar a posição também.*/
    lista.remove("Maça"); 

    /*Predicado
    Remover todo o String x, tal que x.charAt(0) seja igual a 'B' - Remove tudo que começa com B na lista*/
    lista.removeIf(x -> x.charAt(0) == 'B');
    
    /*Podemos usar o FOR para imprimir os valores da lista.
    Aqui o for pecorre os valores da lista e joga eles para a variavel item */
    for (String item : lista) { 
        System.out.println(item);
    }

    System.out.println("--------------------------"); 
    
    /*com o indexof conseguir a posição do elemento na lista e se não achar retorna -1*/
    System.out.println("Index de Kiwi: " + lista.indexOf("Kiwi"));
    System.out.println("Index de Maça: " + lista.indexOf("Maça"));

    System.out.println("--------------------------");
    /*Crianda uma lista em que pega tudo que começa com A

    lista.stream() - Aceita operações com expressoes lambdas | .collect(Collectors.toList() - Transforma novamente para List*/
    List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    System.out.println("Tudo que começa com 'A: '");
    for (String item : result) { 
        System.out.println(item);
    }   

    System.out.println("--------------------------");
    /* Primeira ocorrencia de palavra que começa com A, se nao achar, retorna null*/
    String primeiraOcorrencia = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println("Primeira Ocorrencia de palavra que começa com A: ");

    System.out.println("--------------------------");
    /*Lista.size() - tamanho da lista */
    int divisão = 9 / lista.size();
    System.out.println(divisão);
    
    sc.close();

  }
    
}
