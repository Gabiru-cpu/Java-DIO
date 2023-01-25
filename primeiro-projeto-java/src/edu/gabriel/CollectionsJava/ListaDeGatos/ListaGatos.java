package edu.gabriel.CollectionsJava.ListaDeGatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGatos implements Comparable<ListaGatos> {
    private String nome;
    private Integer idade;
    private String cor;

    ListaGatos(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public static void main(String[] args) {

        List<ListaGatos> meusGatos = new ArrayList<ListaGatos>() {
            {
                add(new ListaGatos("frajola", 15, "Preto e branco"));
                add(new ListaGatos("Jon", 12, "Preto"));
                add(new ListaGatos("Jonas", 11, "Preto"));
                add(new ListaGatos("garfield", 13, "laranja"));
                add(new ListaGatos("Arlindo", 9, "Branco"));
            }
        };
        System.out.println("Ordem de Inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem por nome");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem por idade");
        meusGatos.sort(new CompararIdadeGatos());
        System.out.println(meusGatos);

        System.out.println("Ordem por Cor");
        meusGatos.sort(new CompararCorGatos());
        System.out.println(meusGatos);

        System.out.println("Ordem por Nome/Cor/Idade");
        meusGatos.sort(new CompararNomeIdadeCorGatos());
        System.out.println(meusGatos);
    }

    public String GetNome() {
        return nome;
    }

    public Integer GetIdade() {
        return idade;
    }

    public String GetCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(ListaGatos gato) {

        return this.GetNome().compareToIgnoreCase(gato.GetNome());
    };

}
