package edu.gabriel.CollectionsJava.ListaCrime;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

/*  Faça um programa que faça 5 perguntas para
 * uma pessoa sobre um crime:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima"
 * 5. "Já trabalhou com a vítima?"
 * 2 perguntas "Suspeita" entre 3 a 4 "Cúmplice" 5 "Assassino"
*/

public class Crime implements Comparable<Crime> {
    private String perguntas;
    private Boolean respostas;

    Crime(String perguntas,
            Boolean respostas) {
        this.perguntas = perguntas;
        this.respostas = respostas;

    }

    public static void main(String[] args) {
        List<Crime> interrogadosLista = new ArrayList<Crime>() {
            {
                add(new Crime("Tefonou para a vítima?", true));
                add(new Crime("Esteve no local do crime?", true));
                add(new Crime("Mora perto da vítima?", true));
                add(new Crime("Devia para a vítima?", true));
                add(new Crime("Já trabalhou com a vítima?", true));
            }
        };
        System.out.println("Todas as perguntas e suas respostas:");

        System.out.println(interrogadosLista);

        System.out.println("\nTodas as perguntas respondidas positivamente:");

        Iterator<Crime> it = interrogadosLista.iterator();
        int nivelSuspeita = 0;
        for (Crime interrogadoslista : interrogadosLista) {
            if (it.next().respostas == true) {
                System.out.println(interrogadoslista);
                nivelSuspeita++;
            }
        }

        System.out.println("\nQuantidades de perguntas true: " + nivelSuspeita);
        if (nivelSuspeita == 2)
            System.out.println("Suspeito");
        else if (nivelSuspeita >= 3 && nivelSuspeita <= 4)
            System.out.println("Cúmplice");
        else if (nivelSuspeita == 5)
            System.out.println("Assassino");
        else
            System.out.println("Inocente");

    }

    @Override
    public String toString() {
        return "Pergunta: " + perguntas +
                " Resposta: " + respostas;
    }

    public String GetPerguntas() {
        return perguntas;
    }

    public Boolean GetRespostas() {
        return respostas;
    }

    @Override
    public int compareTo(Crime crime) {

        return this.GetPerguntas().compareToIgnoreCase(crime.GetPerguntas());
    };

}
