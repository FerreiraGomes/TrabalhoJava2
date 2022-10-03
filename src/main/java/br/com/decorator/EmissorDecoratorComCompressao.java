package br.com.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {

    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    public Emissor DecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    void envia(String mensagem) {
        System.out.println("Enviando mensagem comprimida: ");
        String mensagenComprimida;
        try {
            mensagenComprimida = comprime(mensagem);
        } catch (IOException e) {
            mensagenComprimida = mensagem;
        }
        this.getEmissor().envia(mensagenComprimida);
    }

    private String comprime(String mensagem) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());

        dout.write(mensagem.getBytes());
        dout.close();
        return new String(out.toByteArray());
    }
}
