package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaDeLivros;

    public Biblioteca() {
        listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        listaDeLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        listaDeLivros.remove(livro);
    }

    public List<Livro> listarLivros() {
        return listaDeLivros;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter e o Prisioneiro de Askban", "J.K Rowling");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        
        List<Livro> livrosNaBiblioteca = biblioteca.listarLivros();
        System.out.println("Livros na biblioteca:");

        //Laço de repetição pois é uma lista
        for (Livro livro : livrosNaBiblioteca) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println();
        }
    }
}
