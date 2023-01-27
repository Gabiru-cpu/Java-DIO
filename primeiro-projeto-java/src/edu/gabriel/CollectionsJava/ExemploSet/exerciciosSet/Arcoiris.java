package edu.gabriel.CollectionsJava.ExemploSet.exerciciosSet;
/*Crie um conjunto contendo as cores do arco-iris e:
A. Exiba todas as cores uma abaixo da outra V
B. A quantidade de cores que o arco-iris tem V
C. Exiba as cores em ordem alfabética V
D.Exiba as cores na ordem inversa da que foi intormada V
E. Exiba todas as cores que começam com a letra "v" V
F.Remova todas as cores que não começam com a letra "v" V
G. Limpe o conjunto V
H. Confira se o conjunto está vazio V*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Arcoiris {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto com as cores do arco iris");

        Set<String> cores = new HashSet<>(
                Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));

        System.out.println(cores);
        int quantidadeDeCores = 0;
        for (String cor : cores) {
            System.out.println(cor);
            quantidadeDeCores++;
        }
        System.out.println("quantidade de cores: " + quantidadeDeCores);

        System.out.println("Ordem alfabetica");

        Set<String> cores1 = new TreeSet<String>();
        cores1.addAll(cores);

        for (String cor : cores1) {
            System.out.println(cor);
        }

        System.out.println("Ordem inserção inversa");

        Set<String> cores2 = new LinkedHashSet<>(
                Arrays.asList("vevrmelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));

        String[] vetor = new String[cores2.size()];
        int count = 0;
        for (String cor : cores2) {
            vetor[count] = cor;
            count++;
        }

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        System.out.println("Exiba todas as cores que começam com a letra 'v'");

        for (String cor : cores1) {
            if (cor.charAt(0) == 'v')
                System.out.println(cor);

        }

        System.out.println("Remova todas as cores que não começam com a letra 'v'");

        Iterator<String> it = cores1.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.charAt(0) != 'v')
                it.remove();
        }
        System.out.println(cores1);

        System.out.println("Apagar: ");
        cores.clear();
        System.out.println("esta vazio: " + cores.isEmpty());
    }

}
