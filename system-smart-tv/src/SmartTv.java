public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void canalDigitado(int novoCanal) {
        canal = novoCanal;
    }

    public void canalSeguinte() {
        canal++;
    }

    public void canalAnterior() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
}
