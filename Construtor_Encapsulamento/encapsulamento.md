## ENCAPSULAMENTO

* É um principio que consiste em esconder detalhes de implementação de uma classe,
  expondo apenas operações seguras e que mantenham os objetos em um estado consistente.

* O objeto deve sempre estar em um estado consistente, e a propria classe deve garantir isso.

* Um objeto não deve expor nenhum atributo (modificador de acesso private).

* Os atributos devem ser acessados e modificados apenas por meio de métodos (getters e setters).


## Padrão para implementação de getters e setters
```java
private String name; /*Private define que não pode ser acessado por outras classes*/
private double price; 

public String getName() { /*Getter - Utilizasse get seguido pelo nome do atributo em CamelCase*/
return name; /*return do valor do atributo name*/
}
public void setName(String name) {/*Setter - Utilizasse set seguido pelo nome do atributo em CamelCase*/
this.name = name; /*Atribui o valor do parâmetro name ao atributo this.name*/
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
t