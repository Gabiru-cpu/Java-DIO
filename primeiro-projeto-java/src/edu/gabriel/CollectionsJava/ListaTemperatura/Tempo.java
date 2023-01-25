package edu.gabriel.CollectionsJava.ListaTemperatura;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

/*  Faça um programa que receba a temperatura
média dos 6 primeiros meses do ano e armazene-as
em uma lista. Após isto, calcule a média semestral das
temperaturas e mostre todas as temperaturas acima
deta média, e em que mês elas ocorreram (mostrar
o mês por extenso: 1 - Janeiro, 2 - Fevereiro... etc)
*/

public class Tempo implements Comparable<Tempo> {
    private String mes;
    private Integer temperatura;

    Tempo(String mes, Integer temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public static void main(String[] args) {

        List<Tempo> tempLista = new ArrayList<Tempo>() {
            {
                add(new Tempo("1 - Janeiro", 32));
                add(new Tempo("2 - Fevereiro", 35));
                add(new Tempo("3 - Março", 30));
                add(new Tempo("4 - Abril", 28));
                add(new Tempo("5 - Maior", 29));
                add(new Tempo("6 - Junho", 24));
            }
        };

        System.out.println(tempLista);

        Iterator<Tempo> it = tempLista.iterator();
        Integer soma = 0;
        while (it.hasNext()) {
            soma += it.next().temperatura;
        }

        System.out.println(soma);
        int media = (soma / tempLista.size());
        System.out.println("Media das Temperaturas do Semestre: " + media);
        System.out.println("Meses acima da media: ");

        Iterator<Tempo> it1 = tempLista.iterator();

        for (Tempo templista : tempLista) {
            if (it1.next().temperatura > media)
                System.out.println(templista);
        }
    }

    public String GetMes() {
        return mes;
    }

    public Integer GetTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return mes + '\'' +
                " Temp° " + temperatura;
    }

    @Override
    public int compareTo(Tempo tempo) {

        return this.GetMes().compareToIgnoreCase(tempo.GetMes());
    };

}
