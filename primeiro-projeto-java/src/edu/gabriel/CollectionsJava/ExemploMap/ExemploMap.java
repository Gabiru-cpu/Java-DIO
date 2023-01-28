package edu.gabriel.CollectionsJava.ExemploMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione modelos e seus respectivos valores");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {
            {
                put("gol", 14.6);
                put("uno", 16.6);
                put("hb20", 11.2);
                put("mobi", 12.4);
                put("versa", 15.4);
            }
        };
        System.out.println(carrosPopulares);

        System.out.println("Substitua o valor de consumo do gol para 15,2:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo mobi esta no dicionario: " +
                carrosPopulares.containsKey("mobi"));

        System.out.println("Exiba o consumo do hb20: " + carrosPopulares.get("hb20"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o consumo mais eficiente: " + Collections.max(carrosPopulares.values()));

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(
                        "Modelo mais eficiente: " + modeloMaisEficiente + " - Consumo: " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(
                        "Modelo menos eficiente: " + modeloMenosEficiente + " - Consumo: " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a media dos consumos: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual a 15,2 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.2)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba na ordem em que foram informados: ");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>() {
            {
                put("gol", 14.6);
                put("uno", 16.6);
                put("hb20", 11.2);
                put("mobi", 12.4);
                put("versa", 15.4);
            }
        };
        System.out.println(carrosPopulares1);

        System.out.println("Exiba na ordenando por modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<String, Double>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apagando dicionario: ");
        carrosPopulares.clear();

        System.out.println("Conferindo se apagou: " + carrosPopulares.isEmpty());
    }
}
