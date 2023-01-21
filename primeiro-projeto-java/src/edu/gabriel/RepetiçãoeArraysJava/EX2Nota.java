package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Scanner;

public class EX2Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true) {
            System.out.println("envie a nota");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10)
                break;

            System.out.println("VALOR INVALIDO");
        }
        System.out.println("Fim da aplicação");
    }
}
