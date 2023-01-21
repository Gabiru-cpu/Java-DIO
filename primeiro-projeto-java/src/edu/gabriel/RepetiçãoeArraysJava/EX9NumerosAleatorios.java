package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Random;

public class EX9NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numRandons = new int[20];

        for (int i = 0; i < numRandons.length; i++) {
            int num = random.nextInt(100);
            numRandons[i] = num;
        }

        System.out.println("Numeros aleatorios:");
        for (int i : numRandons) {
            System.out.print(i + " ");
        }
    }

}
