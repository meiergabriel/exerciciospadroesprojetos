package exerciciospadroesprojetos.estruturais.notificacoes;

public class Main {
    public static void main(String[] args) {
        Notificacoes notificacao = new LogAuditoriaDecorator(new CriptografiaDecorator(new EmailNotificacao()));
        notificacao.enviar("Mensagem importante");

        // Notificação por SMS simples, sem decoradores
        Notificacoes smsNotificacao = new SMSNotificacao();
        smsNotificacao.enviar("Mensagem simples por SMS");
    }
}
