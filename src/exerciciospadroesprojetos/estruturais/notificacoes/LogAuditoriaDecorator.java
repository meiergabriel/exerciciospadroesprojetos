package exerciciospadroesprojetos.estruturais.notificacoes;

public class LogAuditoriaDecorator extends NotificacaoDecorator{
    public LogAuditoriaDecorator(Notificacoes notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        log(mensagem);
        super.enviar(mensagem);
    }

    private void log(String mensagem) {
        System.out.println("Log de auditoria: " + mensagem);
    }
}
