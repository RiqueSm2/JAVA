package Classes.Entidades;

public class BankAccount {

private int numberAccount;
public String holderName;
private double bankBalance;

/*Sobrecargas*/
public BankAccount(){
}
public BankAccount(int numberAccount, String holderName, double bankBalance){
    this.numberAccount = numberAccount;
    this.holderName = holderName;
    this.bankBalance = bankBalance;   
}
public BankAccount(int numberAccount, String holderName){
    this.numberAccount = numberAccount;
    this.holderName = holderName;
    this.bankBalance = 0.00;  
}


/* Por estar dentro da própria classe, o acesso aos atributos privados pode ser feito diretamente,
   não sendo obrigatório o uso de getters e setters. */

public int getNumberAccount(){
    return numberAccount;
}  
public void setNumberAccount(int numberAccount){
  this.numberAccount =  numberAccount; 
}
/*------------------------------------------ */

public void holderName(String name){
    this.holderName = name;
}


/*------------------------------------------ */

public void setDeposit(double deposit){
    this.bankBalance += deposit;
}
public void setWithdraw (double withdraw){
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