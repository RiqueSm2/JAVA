package exercicios.Entidades;

public class Employer {
    private int id;
    private String name;
    private Double salary;

     public Employer(){
     
    }

    public Employer(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
  
 public int getId (){
  return this.id;
 }
 public String getName(){
  return this.name;
 }
 public Double getSalary(){
  return this.salary;
 }
 
 public void setSalary(double percent){
 this.salary += this.salary * percent / 100;
 }

public String toString(){
 return id + ", " + name + ", " + String.format("%.2f", salary);
}

}



