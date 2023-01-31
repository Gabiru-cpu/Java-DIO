package edu.gabriel.CollectionsJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "2", "3", "4", "5", "6");

        // numerosAleatorios.forEach(System.out::println);

        // Set<String> collectSet = numerosAleatorios.stream()
        // .limit(5)
        // .collect(Collectors.toSet());

        // tranforme esta lista de String em uma lista de numeros inteiros

        // numerosAleatorios.stream()
        // .map(Integer::parseInt)
        // .collect(Collectors.toList())
        // .forEach(System.out::println);

        // pegue os numeros pares e maiores que 2 e coloque em uma lista

        // List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
        // .map(Integer::parseInt)
        // .filter(i -> (i % 2 == 0 && i > 2))
        // .collect(Collectors.toList());
        // System.out.println(ListParesMaioresQue2);

        // Mostre a meida dos numeros
        // numerosAleatorios.stream()
        // .mapToInt(Integer::parseInt)
        // .average()
        // .ifPresent(System.out::println);

        // Remova os numeros impares
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
    }
}
