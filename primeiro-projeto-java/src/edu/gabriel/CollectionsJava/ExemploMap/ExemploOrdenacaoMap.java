package edu.gabriel.CollectionsJava.ExemploMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória");

        Map<String, Livro> meusLivros = new HashMap<String, Livro>() {
            {
                put("Hawking Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg Charles", new Livro("O poder do Hábito", 408));
                put("Harari Yuval Noah", new Livro("21 Lições o século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(
                    livro.getKey() + ": " + livro.getValue().getNome() + " | N° paginas: "
                            + livro.getValue().getPaginas());
        }

        System.out.println("Ordem Inserção");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>() {
            {
                put("Hawking Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg Charles", new Livro("O poder do Hábito", 408));
                put("Harari Yuval Noah", new Livro("21 Lições o século 21", 432));
            }
        };

        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(
                    livro.getKey() + ": " + livro.getValue().getNome() + " | N° paginas: "
                            + livro.getValue().getPaginas());
        }

        System.out.println("Ordem alfabética autores");

        Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(meusLivros1);

        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(
                    livro.getKey() + ": " + livro.getValue().getNome() + " | N° paginas: "
                            + livro.getValue().getPaginas());
        }

        System.out.println("Ordem alfabética nomes dos livros");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new CompararNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(
                    livro.getKey() + ": " + livro.getValue().getNome() + " | N° paginas: "
                            + livro.getValue().getPaginas());
        }

        System.out.println("Ordem número de páginas");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new CompararPaginas());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(
                    livro.getKey() + ": " + livro.getValue().getNome() + " | N° paginas: "
                            + livro.getValue().getPaginas());
        }
    }

}