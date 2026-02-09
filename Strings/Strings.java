package Strings;

import java.util.Scanner;

public class Strings {
       public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String original = "  abcde FGHIJ ABC abc DEFG   ";

    String s1 = original.toLowerCase(); /*tudo minusculo*/

    String s2 = original.toUpperCase(); /*tudo maiusculo*/

    String s3 = original.trim(); /*remove espaços em branco no começo e no final*/

    String s4 = original.substring(2); /*começa do indice 2 até o final*/

    String s5 = original.substring(2, 9); /*começa do indice 2 até o 9 */

    String s6 = original.replace('a', 'x'); /*substitui todas as letras 'a' por 'x' */

    String s7 = original.replace("abc", "xy"); /*substitui todas as sequencias 'abc' por 'xy' */

    int a = original.indexOf("bc"); /*retorna o indice da primeira ocorrência de 'bc' */

    int b = original.lastIndexOf("bc"); /*retorna o indice da última ocorrência*/

    String[] vect = original.split(" "); /*divide a string em um array, usando espaço como separador*/

    original.equals("s"); /*comparando strings Ex.: se original for igual a "s" */

    char response = sc.next().charAt(0); /*Pegando a primeira letra digitada na posição 0, o .charAt é necessario pois o sc.next le uma string e a variavel é char*/
    /* char é um tipo primitivo, por isso não possui o método equals() */


    System.out.println("Original: " + original);
    
    System.out.println("ToUpperCase: " + s1);

    System.out.println("ToLowerCase: " + s2);

    System.out.println("Trim: " + s3);  

    System.out.println("Substring(2): " + s4);

    System.out.println("Substring(2, 9): " + s5);

    System.out.println("Replace('a', 'x'): " + s6);

    System.out.println("Replace(\"abc\", \"xy\"): " + s7);

    System.out.println("Index of 'bc': " + a);

    System.out.println("Last index of 'bc': " + b);

    System.out.println("Palavra no vetor 0: " + vect[0]);
    
    System.out.println("Letra na posição 0: " + response);

    sc.close();
    }
    
}
