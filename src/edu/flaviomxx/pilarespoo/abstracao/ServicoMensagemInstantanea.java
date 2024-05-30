package edu.flaviomxx.pilarespoo.abstracao;

public class ServicoMensagemInstantanea { //Todas as classes que extends essa pai, terão os métodos e atribbutos pré definido aqui, evitando repetição de código.
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
