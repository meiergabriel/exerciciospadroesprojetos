package exerciciospadroesprojetos.estruturais.notificacoes;

//implementacao para envio de sms
public class SMSNotificacao implements Notificacoes {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

}
