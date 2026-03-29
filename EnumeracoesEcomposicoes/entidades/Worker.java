package EnumeracoesEcomposicoes.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import EnumeracoesEcomposicoes.enums.WorkerLevel;

public class Worker {

 private String name;
 private WorkerLevel level;
 private Double baseSalary;

 private Department department; /*Fazendo as associações */

 private List<HourContract> contracts = new ArrayList<>(); /*Como um trabalhador tem varios contratos, é representado como uma lista */
 /*Importante lembrar que não é bom ter um setter nesta lista, para nao trocar a lista */
 


  public Worker() {
}
 public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
 }
 
 public List<HourContract> getContracts() {
   return contracts;
}
/*Adicionando e removendo contratos da lista */
 public void addContract(HourContract contract){
  contracts.add(contract);
 }
 public void removeContract(HourContract contract){
  contracts.remove(contract);  
 } 
/*Calculo de quanto a pessoa recebeu baseada no ano e no mes */
public Double income(Integer year, Integer month){
 double sum = baseSalary;
 Calendar cal = Calendar.getInstance(); /*Criando um objeto com data e horaatual do sistema */

 for(HourContract c : contracts){ /*Testando se o contrato c é do year e month dos parametros e se sim, adicionar a ao sum */
    cal.setTime(c.getDate()); /*setando no calendario a data do contrato c */

    int c_year = cal.get(Calendar.YEAR); /*Extraindo o ano e o mes do contrato c */
    int c_month = 1 + cal.get(Calendar.MONTH); /* +1 pos o MONTH em Calendar começa com 0 */

    if(year == c_year && month == c_month){
      sum += c.totalValue();/* apos a comparacao, é adicionado ao sum */
    }   
  }
  return sum;
}

 public String getName() {
    return name;
 }
 public void setName(String name) {
    this.name = name;
 }
 public WorkerLevel getLevel() {
    return level;
 }
 public void setLevel(WorkerLevel level) {
    this.level = level;
 }
 public Double getBaseSalary() {
    return baseSalary;
 }
 public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
 }
 public Department getDepartment() {
   return department;
}
 public void setDepartment(Department department) {
   this.department = department;
 }

}
