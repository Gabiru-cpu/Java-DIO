package edu.gabriel.EntendendoMétodosJava.EX1;

public class Mensagem {

    public static void ObterMensagem(int horario) {
        if (horario >= 0 && horario <= 5)
            System.out.println("Boa noite");

        else if (horario >= 12 && horario <= 23)
            System.out.println("Boa tarde");

        else if (horario >= 6 && horario <= 11)
            System.out.println("Bom dia");

        else
            System.out.println("horario invalido");
    }

}
