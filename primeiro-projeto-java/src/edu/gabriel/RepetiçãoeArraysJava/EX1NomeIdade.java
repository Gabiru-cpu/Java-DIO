package edu.gabriel.RepetiçãoeArraysJava;

import java.util.Scanner;

public class EX1NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("envie o nome");
            nome = scan.next();

            if (nome.equals("0"))
                break;

            System.out.println("envie a idade");
            idade = scan.nextInt();
        }
        System.out.println("Fim da aplicação");
    }
}