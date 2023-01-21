package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Scanner;

public class EX6Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fat, mult = 1;

        System.out.println("Envie o numero que deseja fatoriar: ");
        fat = scan.nextInt();

        for (int i = fat; i >= 1; i--) {
            mult *= i;
        }

        System.out.println(fat + "!" + " = " + mult);
    }
}
