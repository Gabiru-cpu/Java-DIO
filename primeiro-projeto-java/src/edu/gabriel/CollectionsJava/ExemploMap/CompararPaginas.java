package edu.gabriel.CollectionsJava.ExemploMap;

import java.util.Comparator;
import java.util.Map;

class CompararPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {

        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}