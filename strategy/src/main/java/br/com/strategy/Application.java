package br.com.strategy;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

    Strategy strategyAddition = new AdditionCalculate();
    Strategy strategySubtraction = new SubtractionCalculate();

    Scanner c = new Scanner(System.in);


    System.out.println("Primeiro Valor");
    Double valueFirst = c.nextDouble();

    System.out.println("Segundo Valor");
    Double valueSecond = c.nextDouble();

    System.out.println("O resultado Soma: " +strategyAddition
            .calculate(valueFirst, valueSecond));

    System.out.println("O resultado subtração: " +strategySubtraction
            .calculate(valueFirst, valueSecond));

    }
}
