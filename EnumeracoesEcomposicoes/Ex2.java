package EnumeracoesEcomposicoes;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import EnumeracoesEcomposicoes.entidades.*;

public class Ex2 {

     public static void main(String[] args) throws ParseException{
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); /*Mascara do formato de data */

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that1s awesome!");
    Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                       "Traveling to New Zeland", 
                       "I,m going to visit this wonderful country", 
                       12);
    
    p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);

     }
}
