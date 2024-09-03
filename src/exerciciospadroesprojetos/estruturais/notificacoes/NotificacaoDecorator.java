package exerciciospadroesprojetos.estruturais.notificacoes;

public abstract class NotificacaoDecorator implements Notificacoes{

    protected Notificacoes notificacao;

    public NotificacaoDecorator(Notificacoes notificacao) {
        this.notificacao = notificacao;
    }
    
    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
    }

}
