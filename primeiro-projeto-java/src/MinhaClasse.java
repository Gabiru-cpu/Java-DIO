public class MinhaClasse {

    public static void main(String[] args) {

        final String BR = "Brasil ";

        System.out.print(BR);

        String primeiroNome = "Gabriel";
        String segundoNome = "Henrique";

        String nomeCompleto = NomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String NomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}