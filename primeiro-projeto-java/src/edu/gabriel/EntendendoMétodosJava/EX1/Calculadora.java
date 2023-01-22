package edu.gabriel.EntendendoMétodosJava.EX1;

public class Calculadora {

    public static void Soma(double num1, double num2) {
        double result = num1 + num2;

        System.out.println("Resultado da Soma de " + num1 + " " + num2 + " = " + result);
    }

    public static void Subtracao(double num1, double num2) {
        double result = num1 - num2;

        System.out.println("Resultado da Subtração de " + num1 + " " + num2 + " = " + result);
    }

    public static void Divisao(double num1, double num2) {
        double result = num1 / num2;

        System.out.println("Resultado da Divisão de " + num1 + " " + num2 + " = " + result);
    }

    public static void Multiplicacao(double num1, double num2) {
        double result = num1 * num2;

        System.out.println("Resultado da Multiplicação de " + num1 + " " + num2 + " = " + result);
    }

    public static void Modulo(double num1, double num2) {
        double result = num1 % num2;

        System.out.println("Resultado da Modulo de " + num1 + " " + num2 + " = " + result);
    }
}
