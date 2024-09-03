package exerciciospadroesprojetos.estruturais.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class CatalogoDeLivros {
    private Map<String, Boolean> livros = new HashMap<>();

    public void adicionarLivro(String titulo) {
        livros.put(titulo, true); // true indica que o livro está disponível
        System.out.println("Livro adicionado ao catálogo: " + titulo);
    }

    public boolean buscarLivro(String titulo) {
        return livros.getOrDefault(titulo, false);
    }

    public void marcarComoEmprestado(String titulo) {
        if (livros.containsKey(titulo) && livros.get(titulo)) {
            livros.put(titulo, false); // false indica que o livro está emprestado
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro não disponível: " + titulo);
        }
    }

    public void marcarComoDevolvido(String titulo) {
        if (livros.containsKey(titulo)) {
            livros.put(titulo, true);
            System.out.println("Livro devolvido: " + titulo);
        }
    }
}
