public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Uno", "2020", 0);
        carro1.acelerar(10);
        carro1.detalhesCarro();
        carro1.frear(5);
        carro1.detalhesCarro();
    }
}