package exerciciospadroesprojetos.estruturais.notificacoes;

//implementacao para envio de email
public class EmailNotificacao implements Notificacoes {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-Mail" + mensagem);
    }

}
