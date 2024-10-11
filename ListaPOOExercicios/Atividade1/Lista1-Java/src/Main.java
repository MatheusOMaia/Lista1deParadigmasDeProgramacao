import Atividade1.Carro;
import Atividade2.Carro2;

public class Main {
    public static void main(String[] args) {
        //atividade1();
        atividade2();
    }

    public static void atividade1() {
        Carro carro1 = new Carro("Fiat", "Uno", "2020");
        Carro carro2 = new Carro("Volkswagen", "Gol", "2019");
        Carro carro3 = new Carro("Chevrolet", "Camaro", "2015");

        carro1.detalhesCarro();
        carro2.detalhesCarro();
        carro3.detalhesCarro();
    }
    public static void atividade2() {
        Carro2 carro1 = new Carro2("Fiat", "Uno", "2020", 0);
        carro1.acelerar(10);
        carro1.detalhesCarro();
        carro1.desacelerar(5);
        carro1.detalhesCarro();


    }

}