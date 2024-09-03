package exerciciospadroesprojetos.estruturais.notificacoes;

//implementacao para envio de mensagem via app
public class AppNotificacao implements Notificacoes {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem via APP" + mensagem);
    }

}
