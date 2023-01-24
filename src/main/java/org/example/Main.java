package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Luiz", 29, "masculino");
        pessoa[1] = new Pessoa("laura", 2, "feminino");

        livro[0] = new Livro("Aprendendo java", "José da Silva", 300, pessoa[0]);
        livro[1] = new Livro("Peppa Pig", "Pig", 10, pessoa[1]);
        livro[2] = new Livro("Java Avançado", "Maria Candido", 800, pessoa[0]);

        livro[1].abrir();
        livro[1].folhear(4);
        System.out.println(livro[1].detalhes());
    }
}