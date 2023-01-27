package edu.gabriel.CollectionsJava.ExemploSet.exerciciosSet;

import java.util.Comparator;

public class CompararIDE implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens l1, Linguagens l2) {

        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}
