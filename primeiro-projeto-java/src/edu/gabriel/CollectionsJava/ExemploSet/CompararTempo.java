package edu.gabriel.CollectionsJava.ExemploSet;

import java.util.Comparator;

public class CompararTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getTempoEpisodio();
        // return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    };
}
