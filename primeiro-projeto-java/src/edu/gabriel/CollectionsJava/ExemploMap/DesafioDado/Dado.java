package edu.gabriel.CollectionsJava.ExemploMap.DesafioDado;

/*Simule um lançamento de dados lance o dado 100 
vezes e armazene. Depois, mostre quantas vezes
cada valor foi inserido.*/

import java.util.Random;

public class Dado {
    public static void main(String[] args) {

        Random gerador = new Random();
        int valorDado = 0;

        int[] repeticoes = { 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < 100; i++) {
            valorDado = gerador.nextInt(7);
            while (valorDado == 0) {

                valorDado = gerador.nextInt(7);
            }

            switch (valorDado) {
                case 1:
                    repeticoes[0]++;
                    break;
                case 2:
                    repeticoes[1]++;
                    break;
                case 3:
                    repeticoes[2]++;
                    break;
                case 4:
                    repeticoes[3]++;
                    break;
                case 5:
                    repeticoes[4]++;
                    break;
                case 6:
                    repeticoes[5]++;
                    break;
            }

            System.out.print("[" + valorDado + "]");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("O Número " + (i + 1) + " repetiu: " + repeticoes[i]);
        }
    }

}
