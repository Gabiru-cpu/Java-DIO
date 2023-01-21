package edu.gabriel.RepetiçãoeArraysJava;

public class EX7ArrayInverso {
    public static void main(String[] args) {

        int[] array = { -5, -7, -12, 4, 6, 55 };

        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.println(array[i]);

        }
    }
}
