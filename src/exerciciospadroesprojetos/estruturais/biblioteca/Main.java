package exerciciospadroesprojetos.estruturais.biblioteca;

public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        // Registrar um novo usuário
        biblioteca.registrarNovoUsuario("João Silva");

        // Adicionar um livro ao catálogo
        biblioteca.buscarELocarLivro("Aprendendo Java", "João Silva"); // Teste de empréstimo sem livro no catálogo
        biblioteca.registrarNovoUsuario("Maria Souza");  // Registrando outro usuário
        biblioteca.buscarELocarLivro("Clean Code", "Maria Souza");  // Teste de empréstimo sem livro no catálogo

        biblioteca.registrarNovoUsuario("Lucas Oliveira");
        biblioteca.registrarNovoUsuario("Pedro Gonçalves");

        biblioteca.buscarELocarLivro("Design Patterns", "Lucas Oliveira"); // Teste de empréstimo sem livro no catálogo
        biblioteca.buscarELocarLivro("Refactoring", "Pedro Gonçalves"); // Teste de empréstimo sem livro no catálogo

        // Adicionar um livro ao catálogo
        biblioteca.buscarELocarLivro("Aprendendo Java", "Lucas Oliveira");  // Teste de empréstimo sem livro no catálogo
        biblioteca.buscarELocarLivro("Design Patterns", "Pedro Gonçalves");  // Teste de empréstimo sem livro no catálogo

        // Empréstimo de um livro
        biblioteca.buscarELocarLivro("Clean Code", "Lucas Oliveira");

        // Devolução de um livro
        biblioteca.devolverLivro("Clean Code", "Lucas Oliveira");

        // Empréstimo do mesmo livro para outro usuário
        biblioteca.buscarELocarLivro("Clean Code", "Pedro Gonçalves");
    }
}

