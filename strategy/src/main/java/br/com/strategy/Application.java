package br.com.strategy;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        Pay masterCard = new Mastercard();
        Pay visaCard = new VisaCard();
        Scanner c = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = c.nextDouble();

    System.out.println("---- FORMAS DE PAGAMENTO ----");
        System.out.println("1 - MasterCard");
        System.out.println("2 - VisaCard");
        System.out.println("Digite a opção desejada:");
        Integer numero = c.nextInt();

       if (numero==1) {
           masterCard.pay(valor);
       } else if (numero==2) {
            visaCard.pay(valor);
        }else
        System.out.println("Opção incorreta!");
    }

}
