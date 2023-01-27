package edu.gabriel.CollectionsJava.ExemploSet.exerciciosSet;

import java.util.Comparator;

public class CompararNomeAnoEIDE implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens l1, Linguagens l2) {

        int nome = l1.getNome().compareTo(l2.getNome());

        if (nome != 0)
            return nome;

        int IDE = l1.getIDE().compareTo(l2.getIDE());

        if (IDE != 0)
            return IDE;

        return Integer.compare(l1.getanoDeCriacao(), l2.getanoDeCriacao());
    }

}
