package edu.gabriel.CollectionsJava.ExemploMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

class CompararNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}