package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Scanner;

public class EX5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tab;

        System.out.println("Envie o numero da tabuada desejada: ");
        tab = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(tab + " X " + i + " = " + tab * i);
        }
    }
}
