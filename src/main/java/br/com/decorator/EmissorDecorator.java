package br.com.decorator;

public abstract class EmissorDecorator implements Emissor {
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
    }

    public Emissor Decorator(Emissor emissor) {
        this.emissor = emissor;
        return emissor;
    }

    public abstract void envia(String mensagem);

    public Emissor getEmissor() {
        return this.emissor;
    }
}
