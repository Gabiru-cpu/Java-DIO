package edu.gabriel.RepetiçãoeArraysJava;
//matriz 4x4 com valores aleatorios de 0 a 9

import java.util.Random;

public class EX10ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizRandons = new int[4][4];

        for (int i = 0; i < matrizRandons.length; i++) {

            for (int j = 0; j < matrizRandons[i].length; j++) {
                matrizRandons[i][j] = random.nextInt(9);
            }
        }

        for (int[] line : matrizRandons) {
            for (int column : line) {
                System.out.print(column + " ");

            }
            System.out.println();
        }
    }
}
