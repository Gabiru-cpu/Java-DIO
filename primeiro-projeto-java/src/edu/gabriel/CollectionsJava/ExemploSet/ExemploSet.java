package edu.gabriel.CollectionsJava.ExemploSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione notas");

        Set<Double> notas = new HashSet<>(Arrays.asList(6d, 7d, 8d, 5d, 2d, 12d, 22d));
        System.out.println(notas);

        System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5d));

        System.out.println("Menor nota: " + Collections.min(notas));

        System.out.println("Maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma dos valores: " + soma);

        System.out.println("Media dos valores: " + (soma / notas.size()));
        notas.remove(6d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("Ordem crescente: ");
        Set<Double> notasCrescente = new TreeSet<>(notas);
        System.out.println(notasCrescente);

        // System.out.println("Apagar: ");
        // notas.clear();
        System.out.println(notas.isEmpty());
    }
}
