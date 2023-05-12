package org.example;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.soma(10, 10);

        if (resultado == 20) {
            System.out.println("Funcionou!!");
        } else {
            System.out.println("NAO Funcionou!!");
        }

    }

}