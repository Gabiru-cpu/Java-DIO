package edu.gabriel.CollectionsJava.ExemploMap.MapEstados;
/*Estado PE População = 9616621
Estado AL População = 3351543
Estado CE População = 9187103
Estado RN População = 3534265

- Crie um dicionário um dicionario com estados e suas populações V
- Substitua a população do RN por 3534165 V
- Confira se o estado do PB está no dicionário, caso não adicione PB - 4039277 V
- Exiba a população de PE V
- Exiba todos os estados e suas populaçoes na ordem que foi informado V
- Exiba os estados e suas populações em ordem alfabética V
- Exiba o estado com a menor população e sua quantidade V
- Exiba o estado com a maior população e sua quantidade V
- Exiba a soma da população desses estadosV
- Exiba a média da população dos estados V
- Remova os estados com população menor que 4000000 V
- Apague o dicionario V
- Confira se o dicionario esta apagado V*/

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Estados {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário um dicionario com estados e suas populações");

        Map<String, Integer> estadosBr = new HashMap<String, Integer>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println(estadosBr);

        System.out.println("Substitua a população do RN por 3534165");
        estadosBr.put("RN", 3534165);

        System.out.println(estadosBr);

        System.out.println("Confira se o estado do PB está no dicionário, caso não adicione PB - 4039277");

        if (!estadosBr.containsKey("PB"))
            estadosBr.put("PB", 4039277);

        System.out.println(estadosBr);

        System.out.println("Exiba a população de PE: " + estadosBr.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçoes na ordem que foi informado: ");

        Map<String, Integer> estadosBr1 = new LinkedHashMap<String, Integer>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };

        System.out.println(estadosBr1);

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estadosBr2 = new TreeMap<String, Integer>(estadosBr1);
        System.out.println(estadosBr2);

        System.out.println("Exiba o estado com a menor população e sua quantidade: ");
        Integer estadoMenorP = Collections.min(estadosBr.values());

        Set<Entry<String, Integer>> entries = estadosBr.entrySet();
        String estadoMenor = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(estadoMenorP)) {
                estadoMenor = entry.getKey();
                System.out.println(
                        "estado com menor população: " + estadoMenor + " - População: " + estadoMenorP);
            }
        }

        System.out.println("- Exiba o estado com a maior população e sua quantidade: ");

        Integer estadoMaiorP = Collections.max(estadosBr.values());
        String estadoMaior = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(estadoMaiorP)) {
                estadoMaior = entry.getKey();
                System.out.println(
                        "estado com menor população: " + estadoMaior + " - População: " + estadoMaiorP);
            }
        }

        Iterator<Integer> iterator = estadosBr2.values().iterator();
        int soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Exiba a soma das populações: " + soma);

        System.out.println("Exiba a media das populações: " + (soma / estadosBr2.size()));

        System.out.println("Remova os estados com população menor que 4000000: ");
        Iterator<Integer> iterator1 = estadosBr2.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) {
                iterator1.remove();
            }
        }
        System.out.println(estadosBr2);

        System.out.println("Apagando dicionario: ");
        estadosBr.clear();

        System.out.println("Conferindo se apagou: " + estadosBr.isEmpty());
    }
}
