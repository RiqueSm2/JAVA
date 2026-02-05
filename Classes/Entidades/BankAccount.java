package Classes.Entidades;

public class BankAccount {

/*Numero da conta e o saldo não podem ser alterados - não criar setters */


private int numberAccount;
private String holderName;
private double bankBalance;

/*Sobrecargas*/

public BankAccount(int numberAccount, String holderName){
    this.numberAccount = numberAccount;
    this.holderName = holderName;
    this.bankBalance = 0.00;  
}

public BankAccount(int numberAccount, String holderName, double inicitialDeposit){
    this.numberAccount = numberAccount;
    this.holderName = holderName;
    deposit(inicitialDeposit);  /*Encapsulamento: A regra de negocio está no metodo */ 
}


/* Por estar dentro da própria classe, o acesso aos atributos privados pode ser feito diretamente,
   não sendo obrigatório o uso de getters e setters. */

public int getNumberAccount(){
    return numberAccount;
}  

/*------------------------------------------ */

public void setHoldername(String name){
    this.holderName = name;
}


/*------------------------------------------ */

public void deposit(double deposit){
    this.bankBalance += deposit;
}
public void withdraw (double withdraw){
    this.bankBalance -= (withdraw + 5);

}

public double getBankBalance(){
    return bankBalance;
}
/*------------------------------------------ */
/*Transformando o objeto em uma String */
public String toString(){
 return "Account " + numberAccount + 
        ", Holder " + holderName +
        ", Balance $" + String.format("%.2f", bankBalance);

}


}