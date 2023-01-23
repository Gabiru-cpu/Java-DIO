package edu.gabriel.EntendendoMétodosJava.EX2;

public class Main {

    public static void main(String[] args) {
        // chamada de metodos
        // System.out.println("Exercício quadrilátero");
        // Quadrilatero.area(3);
        // Quadrilatero.area(5d, 5d);
        // Quadrilatero.area(7, 8, 9);
        // Quadrilatero.area(5f, 5f);

        // metodos com retorno
        System.out.println("Exercício quadrilátero com retorno");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println("Area do quadrado: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Area do quadrado: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Area do quadrado: " + areaLosango);
    }

}
