package edu.gabriel.CollectionsJava.ExemploSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemplOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("\tOrdem aleatória");

        Set<Serie> minhasSeries = new HashSet<Serie>() {
            {
                add(new Serie("Got", "Fantasia", 60));
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("that 70s show", "Suspense", 25));
            }
        };

        for (Serie serie : minhasSeries) {
            System.out.println(serie.getName() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\tOrdem inserção");

        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {
            {
                add(new Serie("Got", "Fantasia", 60));
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("that 70s show", "Suspense", 25));
            }
        };

        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getName() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\tOrdem natural");

        Set<Serie> minhasSeries2 = new TreeSet<Serie>() {
            {
                add(new Serie("Got", "Fantasia", 60));
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("that 70s show", "Suspense", 25));
            }
        };

        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getName() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\tOrdem Nome/Gênero/Tempo");

        Set<Serie> minhasSeries3 = new TreeSet<Serie>(new CompareNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getName() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\tOrdem Gênero");
        Set<Serie> minhasSeries4 = new TreeSet<Serie>(new CompararGenero());
        minhasSeries4.addAll(minhasSeries);

        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getName() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\tOrdem Tempo de episodio");
        Set<Serie> minhasSeries5 = new TreeSet<Serie>(new CompararTempo());
        minhasSeries5.addAll(minhasSeries);

        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getName() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }

}
