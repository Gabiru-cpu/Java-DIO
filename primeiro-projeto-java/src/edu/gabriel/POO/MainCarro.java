package edu.gabriel.POO;

public class MainCarro {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        System.out.println("carro1 obs: pegando valores padrao");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());

        Carro carro2 = new Carro("Cinza", "Ferarri", 62);

        System.out.println("carro2");
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
    }

}
