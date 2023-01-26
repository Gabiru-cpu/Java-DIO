package edu.gabriel.CollectionsJava.ExemploSet;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String name;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String name, String genero, Integer tempoEpisodio) {
        this.name = name;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{Nome='" + name + '\'' +
                ", Genero=" + genero +
                ", Tempo de episodio='" + tempoEpisodio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    };

}
