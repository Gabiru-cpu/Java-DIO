package edu.gabriel.CollectionsJava.ExemploSet.exerciciosSet;

/*Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto
com 3 linguagens e faça um programa que ordene esse conjunto:
A.Ordem de Inserção V
B.Ordem Natural(nome) V
C.IDE V
D.Ano de criação e nome V
E.Nome, ano de criação e IDE V
Ao final, exiba as linguagens no console, um abaixo da */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {
    public static void main(String[] args) {
        System.out.println("Ordem de Inserção");

        Set<Linguagens> minhasLinguagens = new LinkedHashSet<Linguagens>() {
            {
                add(new Linguagens("Java", "Intellij", 1991));
                add(new Linguagens("C#", "Visual Studio", 2000));
                add(new Linguagens("JPython", "Pycharm", 1991));
            }
        };

        for (Linguagens linguagens : minhasLinguagens) {
            System.out.println(
                    linguagens.getNome() + " - " + linguagens.getIDE() + " - " + linguagens.getanoDeCriacao());
        }

        System.out.println("Ordem natural");

        Set<Linguagens> minhasLinguagens1 = new TreeSet<Linguagens>();
        minhasLinguagens1.addAll(minhasLinguagens);

        for (Linguagens linguagens : minhasLinguagens1) {
            System.out.println(
                    linguagens.getNome() + " - " + linguagens.getIDE() + " - " + linguagens.getanoDeCriacao());
        }

        System.out.println("Ordem IDE");
        Set<Linguagens> minhasLinguagens2 = new TreeSet<Linguagens>(new CompararIDE());
        minhasLinguagens2.addAll(minhasLinguagens);

        for (Linguagens linguagens : minhasLinguagens2) {
            System.out
                    .println(linguagens.getNome() + " - " + linguagens.getIDE() + " - " + linguagens.getanoDeCriacao());
        }

        System.out.println("Ordem ano de criação e IDE");

        Set<Linguagens> minhasLinguagens3 = new TreeSet<Linguagens>(new CompararAnoEIDE());
        minhasLinguagens3.addAll(minhasLinguagens);

        for (Linguagens linguagens : minhasLinguagens3) {
            System.out
                    .println(linguagens.getNome() + " - " + linguagens.getIDE() + " - " + linguagens.getanoDeCriacao());
        }

        System.out.println("Ordem Nome, ano de criação e IDE");

        Set<Linguagens> minhasLinguagens4 = new TreeSet<Linguagens>(new CompararNomeAnoEIDE());
        minhasLinguagens4.addAll(minhasLinguagens);

        for (Linguagens linguagens : minhasLinguagens4) {
            System.out
                    .println(linguagens.getNome() + " - " + linguagens.getIDE() + " - " + linguagens.getanoDeCriacao());
        }
    }
}
