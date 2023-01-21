package edu.gabriel.RepetiçãoeArraysJava;

public class EX8Consoantes {
    public static void main(String[] args) {
        String[] array = { "a", "b", "c", "g", "i", "o" };
        int consoantes = 0;

        System.out.println("Consoantes do array: ");
        for (int i = 0; i < (array.length); i++) {

            if (array[i] != "a" &&
                    array[i] != "e" &&
                    array[i] != "i" &&
                    array[i] != "o" &&
                    array[i] != "u") {
                System.out.print(array[i] + " ");
                consoantes++;

            }
        }
        System.out.println("\nQuantidade de consoantes: " + consoantes);
    }

}
