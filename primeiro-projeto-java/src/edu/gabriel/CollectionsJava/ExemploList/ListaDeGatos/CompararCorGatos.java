package edu.gabriel.CollectionsJava.ExemploList.ListaDeGatos;

import java.util.Comparator;

public class CompararCorGatos implements Comparator<ListaGatos> {
    @Override
    public int compare(ListaGatos gato1, ListaGatos gato2) {
        return gato1.GetCor().compareToIgnoreCase(gato2.GetCor());
    }
}
