package EstruturasDeControle;
public class For_forEach {
       public static void main(String[] args) {
        
        /*O for é util para quando ja sabemos quantas vezes queremos repetir algo
         Também utilizado para percorrer coleções de dados(listas)
         Loop for que imprime os valores de i de 0 a 4
         Enquanto i for menor que 5, incrementa 1 em i */
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        /*Laço "for each" 
        */
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        /*"Para cada objeto obj, contido no vetor vect, faça: " */
        for(String obj : vect){ 
            System.out.println(obj);

        }
    }
    
}
