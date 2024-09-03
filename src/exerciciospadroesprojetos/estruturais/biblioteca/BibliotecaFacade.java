package exerciciospadroesprojetos.estruturais.biblioteca;

public class BibliotecaFacade {
    private CatalogoDeLivros catalogoDeLivros;
    private RegistroDeUsuarios registroDeUsuarios;
    private GerenciamentoDeEmprestimos gerenciamentoDeEmprestimos;
    private Notificacoes notificacoes;

    public BibliotecaFacade() {
        this.catalogoDeLivros = new CatalogoDeLivros();
        this.registroDeUsuarios = new RegistroDeUsuarios();
        this.gerenciamentoDeEmprestimos = new GerenciamentoDeEmprestimos();
        this.notificacoes = new Notificacoes();
    }

    public void buscarELocarLivro(String tituloLivro, String nomeUsuario) {
        if (catalogoDeLivros.buscarLivro(tituloLivro)) {
            if (registroDeUsuarios.usuarioExiste(nomeUsuario)) {
                catalogoDeLivros.marcarComoEmprestado(tituloLivro);
                gerenciamentoDeEmprestimos.emprestarLivro(tituloLivro, nomeUsuario);
                notificacoes.enviarNotificacao("Você emprestou o livro: " + tituloLivro, nomeUsuario);
            } else {
                System.out.println("Usuário não registrado: " + nomeUsuario);
            }
        } else {
            System.out.println("Livro não encontrado no catálogo: " + tituloLivro);
        }
    }

    public void registrarNovoUsuario(String nomeUsuario) {
        registroDeUsuarios.registrarUsuario(nomeUsuario);
    }

    public void devolverLivro(String tituloLivro, String nomeUsuario) {
        if (gerenciamentoDeEmprestimos.consultarEmprestimo(tituloLivro) != null) {
            catalogoDeLivros.marcarComoDevolvido(tituloLivro);
            gerenciamentoDeEmprestimos.devolverLivro(tituloLivro);
            notificacoes.enviarNotificacao("Você devolveu o livro: " + tituloLivro, nomeUsuario);
        } else {
            System.out.println("O livro não foi emprestado: " + tituloLivro);
        }
    }
}
