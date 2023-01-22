package edu.gabriel.EntendendoMétodosJava.EX1;

public class Emprestimo {

    public static int ObterDuasParcelas() {
        return 2;
    }

    public static int ObterTresParcelas() {

        return 3;
    }

    public static void CalcularEmprestimo(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * .3);

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * .45);

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}
