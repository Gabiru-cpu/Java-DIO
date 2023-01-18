import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Scanner getKey = new Scanner(System.in);

        int process = 0, key = 0;

        do {
            System.out.println("Estado da TV: " + smartTv.ligado);
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

            System.out.println("MENU:");

            System.out.println("envie 1 para ligar/desligar a TV:");
            System.out.println("envie 2 para passar para o próximo canal:");
            System.out.println("envie 3 para passar para o canal anterior:");
            System.out.println("envie 4 para aumentar o volume:");
            System.out.println("envie 5 para diminuir o volume:");
            System.out.println("envie 6 para digitar o canal desejado:");

            key = getKey.nextInt();

            switch (key) {
                case 1:

                    if (smartTv.ligado) {
                        smartTv.desligar();
                    } else {
                        smartTv.ligar();
                    }
                    break;
                case 2:
                    smartTv.canalSeguinte();
                    break;

                case 3:
                    smartTv.canalAnterior();
                    break;

                case 4:
                    smartTv.aumentarVolume();
                    break;

                case 5:
                    smartTv.diminuirVolume();
                    break;

                case 6:
                    int valor = getKey.nextInt();

                    System.out.println("Querir para qual canal?");

                    smartTv.canalDigitado(valor);
                    break;
                default:
                    System.out.println("valor inválido");
                    break;
            }

            System.out.println("Deseja mandar outra operação envie '1' caso não envie '0'");
            process = getKey.nextInt();
        } while (process != 0);
    }
}
