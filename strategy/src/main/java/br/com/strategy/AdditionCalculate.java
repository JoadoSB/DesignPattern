package br.com.strategy;

public class AdditionCalculate extends Strategy{

    private double addition;

    @Override
    public double calculate(double valueFirst, double valueSecond) {
        this.addition = valueFirst + valueSecond;
        return addition;
    }

}
