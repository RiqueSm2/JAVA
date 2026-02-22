# Revisão Completa – Java (Listas, Objetos, Métodos e Cálculos)

Este arquivo reúne **todas as dúvidas**, **explicações** e **revisões** feitas ao longo do exercício de leitura de pessoas, cálculo de médias e porcentagens, usando Java com **POO** e **List**.

---

## 🧠 Visão Geral do Problema

> Ler nome, idade e altura de **N pessoas**, calcular:
> - altura média
> - porcentagem de pessoas com menos de 16 anos
> - nomes das pessoas com menos de 16 anos

A solução foi dividida em **3 responsabilidades**:

- `Pessoa` → modelo de dados
- `Cad_Pessoa` → gerencia a lista e os cálculos
- `Alturas` → entrada de dados e saída (main)

---

## 👤 Classe `Pessoa`

Representa uma pessoa real. **Um objeto = uma pessoa completa**.

```java
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nIdade: " + idade +
               "\nAltura: " + altura;
    }
}
```

### 📌 Conceitos importantes
- `private` → protege os atributos
- `get` → acesso controlado (encapsulamento)
- `toString()` → define **como o objeto é impresso**

Sem `toString()` o Java imprime: `Pessoa@hash`

---

## 📦 Classe `Cad_Pessoa`

Responsável por **armazenar** e **processar** as pessoas.

```java
public class Cad_Pessoa {

    // Lista única compartilhada (static)
    private static List<Pessoa> cadastro = new ArrayList<>();

    public static void adicionarPessoa(Pessoa p) {
        cadastro.add(p);
    }
```

### 🔹 Por que `static`?
- A lista é **uma só**
- Não é necessário instanciar `Cad_Pessoa`

---

## 📋 Listar pessoas

```java
public static void listarPessoas() {
    for (int i = 0; i < cadastro.size(); i++) {
        System.out.println("Dados da " + (i + 1) + "a pessoa:");
        System.out.println(cadastro.get(i));
    }
}
```

- `cadastro.get(i)` retorna um **objeto Pessoa**
- `println` chama automaticamente `toString()`

---

## 📊 Média de altura

```java
public static double media_Altura() {
    double soma = 0;

    for (Pessoa p : cadastro) {
        soma += p.getAltura();
    }

    return soma / cadastro.size();
}
```

### 📌 Importante
- Retorna `double`
- **Não formata casas decimais** (isso é feito no `printf`)

---

## 👶 Pessoas com menos de 16 anos

### Retornando a lista

```java
public static List<String> getMenoresDe16() {

    List<String> menores = new ArrayList<>();

    for (Pessoa p : cadastro) {
        if (p.getIdade() < 16) {
            menores.add(p.getNome());
        }
    }

    return menores;
}
```

### 📌 Por que aparece `[nome]`?
- Porque é uma **List**
- O `toString()` da lista imprime com colchetes

Para evitar isso, imprime-se com `for` no `main`.

---

## 📈 Porcentagem de menores de 16

```java
public static double getPercentMenoresDe16() {
    return (double) getMenoresDe16().size() / cadastro.size() * 100;
}
```

### 📌 Por que `(double)`?
- `size()` retorna `int`
- `int / int` gera divisão inteira

O cast garante cálculo correto.

---

## ▶️ Classe `Alturas` (main)

Responsável por **ler dados** e **mostrar resultados**.

```java
Scanner sc = new Scanner(System.in);

System.out.print("Quantas pessoas serao digitadas? ");
int n = sc.nextInt();
sc.nextLine();

for (int i = 0; i < n; i++) {
    System.out.printf("Digite os dados da %d° pessoa:%n", i + 1);

    System.out.print("Nome: ");
    String name = sc.nextLine();

    System.out.print("Idade: ");
    int idade = sc.nextInt();

    System.out.print("Altura: ");
    double altura = sc.nextDouble();
    sc.nextLine();

    Pessoa p = new Pessoa(name, idade, altura);
    Cad_Pessoa.adicionarPessoa(p);
}
```

---

## 🖨️ Impressão dos resultados

```java
System.out.printf("Altura média: %.2f%n", Cad_Pessoa.media_Altura());

System.out.printf(
    "Pessoas com menos de 16 anos: %.1f%%%n",
    Cad_Pessoa.getPercentMenoresDe16()
);

for (String nome : Cad_Pessoa.getMenoresDe16()) {
    System.out.println(nome);
}
```

### 📌 Regras do `printf`
- `%.2f` → 2 casas decimais
- `%%` → imprime `%`
- **Nunca concatenar valor no `printf`**

---

## ❌ Erros comuns explicados

### ❓ Por que não posso declarar variável no `return`?
```java
return double x = 10; // ❌
```

Porque `return` **só aceita valores**, não declarações.

---

### ❓ Posso retornar `System.out.println()`?
❌ Não. `println` imprime, não retorna valor.

---

### ❓ Por que Java parece difícil?
Porque Java:
- exige entendimento real
- não esconde a lógica
- força boas práticas

Confusão aqui = aprendizado real.

---

## ✅ Conclusão

Neste exercício foram consolidados:
- POO (classe, objeto, encapsulamento)
- Listas (`List`, `ArrayList`)
- Métodos `static`
- `for` e `for-each`
- Cálculo de média e porcentagem
- `Scanner`
- `printf`
- `toString`

👉 Isso é **base sólida de Java**, não iniciante superficial.

---

📌 **Guarde este arquivo**. Ele é seu mapa mental de Java até aqui.

