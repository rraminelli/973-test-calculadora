package org.example;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divide(10, 0);

        System.out.println(resultado);

        if (resultado == 0) {
            System.out.println("Funcionou!!");
        } else {
            System.out.println("NAO Funcionou!!");
        }

    }

}