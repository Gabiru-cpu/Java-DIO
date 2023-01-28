package edu.gabriel.CollectionsJava.ExemploList.ListaDeGatos;

import java.util.Comparator;

public class CompararNomeIdadeCorGatos implements Comparator<ListaGatos> {
    @Override
    public int compare(ListaGatos gato1, ListaGatos gato2) {
        int nome = gato1.GetNome().compareToIgnoreCase(gato2.GetNome());

        if (nome != 0)
            return nome;

        int cor = gato1.GetCor().compareToIgnoreCase(gato2.GetCor());

        if (cor != 0)
            return cor;

        return Integer.compare(gato1.GetIdade(), gato2.GetIdade());
    }
}
