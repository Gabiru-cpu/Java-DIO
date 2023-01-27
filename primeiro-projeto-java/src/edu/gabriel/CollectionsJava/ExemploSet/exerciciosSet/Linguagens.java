package edu.gabriel.CollectionsJava.ExemploSet.exerciciosSet;

import java.util.Objects;

public class Linguagens implements Comparable<Linguagens> {

    private String nome;
    private String IDE;
    private Integer anoDeCriacao;

    Linguagens(String nome, String IDE, Integer anoDeCriacao) {
        this.nome = nome;
        this.IDE = IDE;
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getNome() {
        return nome;
    }

    public String getIDE() {
        return IDE;
    }

    public Integer getanoDeCriacao() {
        return anoDeCriacao;
    }

    @Override
    public String toString() {
        return "{Nome='" + nome + '\'' +
                ", IDE=" + IDE +
                ", Ano de criação='" + anoDeCriacao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Linguagens linguagens = (Linguagens) o;
        return nome.equals(linguagens.nome) && IDE.equals(linguagens.IDE)
                && anoDeCriacao.equals(linguagens.anoDeCriacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, IDE, anoDeCriacao);
    }

    @Override
    public int compareTo(Linguagens linguagens) {
        return this.getNome().compareTo(linguagens.getNome());
    }
}
