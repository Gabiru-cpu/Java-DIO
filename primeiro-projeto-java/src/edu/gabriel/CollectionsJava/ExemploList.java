package edu.gabriel.CollectionsJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(2d);
        notas.add(1d);
        notas.add(5d);
        notas.add(7d);

        System.out.println(notas);
        // caso nao seja colocaado o indicador da variavel(7"D") sera apagado a posição
        // logo remove(7); apaga a posição 7 remove(7d); apaga o valor 7
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

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media dos valores: " + (soma / notas.size()));

        // Iterator<Double> iterator1 = notas.iterator();
        // while (iterator1.hasNext()) {
        // Double next = iterator1.next();
        // if (next < 7)
        // iterator1.remove();
        // }
        // System.out.println("Exibindo apos deletar valores menores que 7: " + notas);

        System.out.println("APAGANDO TODA A LISTA");
        // notas.clear();
        System.out.println(notas);
        System.out.println("" + notas.isEmpty());

        System.out.println("Criando lista 'notas2' e passando os elementos da primeira lista para a nova lista");

        LinkedList<Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2);

        System.out.println("Exibindo o primeiro valor sem Apagar: " + notas2.getFirst());

        System.out.println("Exibindo o primeiro valor e Apagando: " + notas2.getFirst());
        notas2.removeFirst();
    }
}
