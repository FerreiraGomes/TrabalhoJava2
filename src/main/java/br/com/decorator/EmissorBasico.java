package br.com.decorator;

public class EmissorBasico implements Emissor {

    public void envia(String mensagem) {
        System.out.println("Enviando uma mensagem: ");
        System.out.println(mensagem);
    }
}
