package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Scanner;

public class EX4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, N, par = 0, impar = 0;

        System.out.println("Envie a quantidade de numeros que serão enviados:");
        N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Envie um número: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("números pares: " + par);
        System.out.println("números impares: " + impar);

        System.out.println("Fim da aplicação");
    }

}
