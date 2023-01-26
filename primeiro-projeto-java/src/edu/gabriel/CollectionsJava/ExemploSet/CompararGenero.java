package edu.gabriel.CollectionsJava.ExemploSet;

import java.util.Comparator;

public class CompararGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    };
}
