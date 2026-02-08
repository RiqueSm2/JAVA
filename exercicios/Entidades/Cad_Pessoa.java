package exercicios.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Cad_Pessoa {
/*Transformando o cad_pessoa em estatico para não ser necessario instanciar*/
private static List<Pessoa> cadastro = new ArrayList<>();

public static void adicionarPessoa(Pessoa p){
  cadastro.add(p);
}

public static void listarPessoas(){
   for (int i = 0; i < cadastro.size(); i++){
     System.out.println("Dados da " + (i + 1) + "a pessoa:");
     System.out.println(cadastro.get(i));
   }
}

/*
cadastro.get(i) retorna um objeto do tipo Pessoa.
O System.out.println não sabe imprimir objetos diretamente,
então o Java chama automaticamente o método toString() do objeto:
System.out.println(cadastro.get(i).toString()).

Por isso o método toString() é implementado na classe Pessoa,
para definir o que será exibido e evitar o retorno padrão
Pessoa@hash.
*/



/*Utilizando os metodos de Pessoa*/

public static void listarMenoresDe16(){
List<String> menor = new ArrayList<>();

 for (Pessoa p : cadastro){
  if (p.getIdade() < 16){
    menor.add(p.getNome());
    }
 }
System.out.println("Menores de 16: " + menor); 
}

// Cria e retorna uma lista com os nomes das pessoas cuja idade é menor que 16 anos
/*get é utilizado apenas como design de codigo */
public static List<String> getMenoresDe16() {

    List<String> menores = new ArrayList<>();

    for (Pessoa p : cadastro) {
        if (p.getIdade() < 16) {
            menores.add(p.getNome());
        }
    }

    return menores;
}


public static double getPercentMenoresDe16(){

List<String> menores = new ArrayList<>();
    for (Pessoa p : cadastro) {
        if (p.getIdade() < 16) {
            menores.add(p.getNome());
        }
    }
 double porcentagem = (double) menores.size() / cadastro.size() * 100;
 /*Casting para double, pois .size() retorna int  */
 return porcentagem;
}


public static double media_Altura(){
double soma = 0;
for(Pessoa p : cadastro){
soma+=p.getAltura();  
}
return soma/cadastro.size();
}



}