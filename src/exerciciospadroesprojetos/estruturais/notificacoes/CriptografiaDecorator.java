package exerciciospadroesprojetos.estruturais.notificacoes;

public class CriptografiaDecorator extends NotificacaoDecorator{

    public CriptografiaDecorator(Notificacoes notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        mensagem = criptografar(mensagem);
        super.enviar(mensagem);
    }
    private String criptografar(String mensagem) {
        return "*-*-*-*" + mensagem + "*-*-*-*";
    }
}
