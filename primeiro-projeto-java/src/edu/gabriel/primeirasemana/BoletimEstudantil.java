package edu.gabriel.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;

        if (mediaFinal < 6) {
            System.out.print("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.print("EXAME");
        } else {
            System.out.print("APROVADO");
        }

        Boolean exist = false;
        // Operador ternario
        String result = exist ? "yes" : "no";

        System.out.println(result);
    }
}
