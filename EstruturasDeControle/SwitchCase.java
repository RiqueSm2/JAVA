package EstruturasDeControle;
public class SwitchCase {
   public static void main(String[] args) {
        
    int x = 10;
    switch (x) {

      case 8:
        System.out.println("X é menor que 10");
        break;

      case 12:
        System.out.println("Maior que 10");

      default: /*Se nenhuma das condições anteriores for verdadeira */
        System.out.println("Igual a 10");
    }

    }
}
