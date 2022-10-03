package br.com.adapter;

public class TestaControleDePonto {

    public static void main (String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePontoAdapter ();
        Funcionario funcionario = new Funcionario ("Marcelo Martins");
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registraEntrada(funcionario);
    }

}
