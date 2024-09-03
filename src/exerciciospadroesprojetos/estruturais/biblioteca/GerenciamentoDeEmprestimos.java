package exerciciospadroesprojetos.estruturais.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class GerenciamentoDeEmprestimos {
    private Map<String, String> emprestimos = new HashMap<>();

    public void emprestarLivro(String titulo, String nomeUsuario) {
        emprestimos.put(titulo, nomeUsuario);
        System.out.println("Livro " + titulo + " emprestado para " + nomeUsuario);
    }

    public void devolverLivro(String titulo) {
        emprestimos.remove(titulo);
        System.out.println("Livro " + titulo + " devolvido");
    }

    public String consultarEmprestimo(String titulo) {
        return emprestimos.get(titulo);
    }
}