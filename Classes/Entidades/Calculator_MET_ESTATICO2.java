package Classes.Entidades;

public class Calculator_MET_ESTATICO2 {

public static final double PI = 3.14159; /*Final significa que a variavel não pode ser mudada (PADRAO É LESTRAS MAIUSCULAS)*/

public static double circumference(double radius) { /*static siginifica que é um metodo da propria classe, ou seja, não precisa instanciar o objeto */
    return 2.0 * PI * radius;
}

public static double volume(double radius) {
    return 4.0 * PI * radius * radius * radius / 3.0; 

}

}