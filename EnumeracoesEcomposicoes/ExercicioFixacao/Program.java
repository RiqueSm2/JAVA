package EnumeracoesEcomposicoes.ExercicioFixacao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import EnumeracoesEcomposicoes.ExercicioFixacao.Enums.OrderStatus;
import EnumeracoesEcomposicoes.ExercicioFixacao.entidades.*;


public class Program {
    public static void main(String [] args) throws ParseException{
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
      Scanner sc = new  Scanner(System.in);

      System.out.println("Enter cliente data: ");
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.nextLine();
      System.out.print("Birth date (DD/MM/YYYY): ");
      Date birth = sdf.parse(sc.next());

      Client client = new Client(name, email, birth);

      System.out.println("Enter order data: ");
      System.out.println("Status: ");
      OrderStatus status = OrderStatus.valueOf(sc.next());
   
      Order order = new Order(new Date(), status, client );
       
      System.out.println("How mant items to this order? ");
      int num = sc.nextInt();
     

      for (int i = 0; i< num; i++){
        sc.nextLine();
        System.out.println("Enter #" + (i + 1) + " item data: ");
        System.out.print("Product Name: ");
        String prodName = sc.nextLine();
        
        System.out.print("Product Price: ");
        Double prodPrice = sc.nextDouble();
            
        Product product = new Product(prodName, prodPrice); 

        System.out.print("Quantity: ");
        int prodQuantity = sc.nextInt();
          
        OrderItem orderItem = new OrderItem(prodQuantity, prodPrice, product);
        order.addItem(orderItem);
      }

      System.out.println();
      System.out.println("ORDER SUMARY: ");
      System.out.println(order);


      sc.close();
    }
    
}
