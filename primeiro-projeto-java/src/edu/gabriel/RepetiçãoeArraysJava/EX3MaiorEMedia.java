package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Scanner;

public class EX3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = 0;
        double media = 0;
        double maior = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Envie o número: " + i);

            num = scan.nextDouble();

            if (num > maior)
                maior = num;

            media += num;
        }
        media /= 5;

        System.out.println("Maior número: " + maior);
        System.out.println("Media dos números: " + media);

        System.out.println("Fim da aplicação");
    }
}
