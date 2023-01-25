package edu.gabriel.CollectionsJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(2d);
        notas.add(1d);
        notas.add(5d);
        notas.add(7d);

        System.out.println(notas);

        notas.remove(7d);
        System.out.println(notas);

        System.out.println("Exibe a posição da nota 1 - posição: " + notas.indexOf(1d));

        System.out.println("Adicionando na lista a nota 8 na posição 2 ");
        notas.add(2, 8d);
        System.out.println("8 adicionado na posição 2: " + notas);

        System.out.println("Substituindo a nota 1 para 6");
        notas.set(notas.indexOf(1d), 6d);
        System.out.println("1 substituido por 6: " + notas);

        System.out.println("Confira se a nota 6 está na lista: " + notas.contains(1d));

        // exibindo com foreach
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
    }
}
