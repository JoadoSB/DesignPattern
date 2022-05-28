package br.com.strategy;

public class VisaCard extends Pay{

    @Override
    public void pay(double valor) {
        System.out.println("Valor de " +valor +" pago com VisaCard!");
    }

}
