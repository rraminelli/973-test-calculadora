package org.example;

public class Calculadora {

    public double soma(double v1, double v2) {
        return v1 + v2;
    }

    public double multiplica(double v1, double v2) {
        return v1 * v2;
    }

    public double divide(double v1, double v2) {
        if (v2 == 0) {
            throw new RuntimeException("Nao pode dividir por zero.");
        }
        return v1 / v2;
    }

    public double subtrai(double v1, double v2) {
        return v1 - v2;
    }

}
