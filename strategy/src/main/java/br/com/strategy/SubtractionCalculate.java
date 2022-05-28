package br.com.strategy;

public class SubtractionCalculate extends Strategy{

    private Double subtraction;

    @Override
    public double calculate(double valueFirst, double valueSecond) {
        this.subtraction = valueFirst - valueSecond;
        return subtraction;
    }
}