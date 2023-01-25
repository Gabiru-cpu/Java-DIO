package edu.gabriel.CollectionsJava.ListaDeGatos;

import java.util.Comparator;

public class CompararIdadeGatos implements Comparator<ListaGatos> {
    @Override
    public int compare(ListaGatos gato1, ListaGatos gato2) {
        return Integer.compare(gato1.GetIdade(), gato2.GetIdade());
    }
}